package com.tencent.mm.plugin.finder.feed.model.internal;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \u001d*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001eB\u0019\b\u0016\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001aB!\b\u0016\u0012\u0006\u0010\u001b\u001a\u00028\u0000\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0019\u0010\u001cJ\u0018\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tJ\u0016\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bJ\u0018\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Ljava/util/ArrayList;", "", ya.b.INDEX, "get", "(I)Ljava/lang/Object;", "Ljz5/f0;", "clearBuffer", "", "getBuffer", "", "elements", "", "setBuffer", "element", "contains", "(Ljava/lang/Object;)Z", "buffer", "Ljava/util/List;", "getTotalSize", "()I", "totalSize", "getOffset", "offset", "<init>", "(Ljava/util/ArrayList;)V", "t", "(Ljava/lang/Object;Ljava/util/ArrayList;)V", "Companion", "com/tencent/mm/plugin/finder/feed/model/internal/t", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DataBuffer<T> extends java.util.ArrayList<T> {
    public static final com.tencent.mm.plugin.finder.feed.model.internal.t Companion = new com.tencent.mm.plugin.finder.feed.model.internal.t(null);
    public static final java.lang.String TAG = "DataBuffer";
    private final java.util.List<T> buffer;

    public DataBuffer(java.util.ArrayList<T> buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.buffer = buffer;
    }

    public final void clearBuffer() {
        this.buffer.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(java.lang.Object element) {
        return super.contains(element) || this.buffer.contains(element);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public T get(int index) {
        return index < size() ? (T) super.get(index) : this.buffer.get((index - size()) + getOffset());
    }

    public final java.util.List<T> getBuffer() {
        return this.buffer;
    }

    public final int getOffset() {
        java.lang.Object k07 = kz5.n0.k0(this);
        if (k07 != null) {
            return this.buffer.indexOf(k07) + 1;
        }
        return 0;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public final int getTotalSize() {
        return size() + (this.buffer.size() - getOffset());
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i17) {
        return (T) removeAt(i17);
    }

    public /* bridge */ java.lang.Object removeAt(int i17) {
        return super.remove(i17);
    }

    public final boolean setBuffer(java.util.Collection<? extends T> elements) {
        clearBuffer();
        if (elements == null) {
            return false;
        }
        com.tencent.mars.xlog.Log.i(TAG, "[addAllBuffer] " + elements.size());
        return this.buffer.addAll(elements);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* synthetic */ DataBuffer(java.util.ArrayList arrayList, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? new java.util.ArrayList() : arrayList);
    }

    public DataBuffer(T t17, java.util.ArrayList<T> buffer) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        this.buffer = buffer;
        add(t17);
    }

    public /* synthetic */ DataBuffer(java.lang.Object obj, java.util.ArrayList arrayList, int i17, kotlin.jvm.internal.i iVar) {
        this(obj, (i17 & 2) != 0 ? new java.util.ArrayList() : arrayList);
    }
}
