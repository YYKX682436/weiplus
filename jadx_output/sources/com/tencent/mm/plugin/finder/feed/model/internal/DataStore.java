package com.tencent.mm.plugin.finder.feed.model.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0010\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\u0006\u0010\u0010\u001a\u00020\u000fJ \u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014\"\u0004\b\u0001\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012J#\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR(\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/model/internal/DataStore;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "", "isEmpty", "", "getSize", "getLast", "()Ljava/lang/Object;", ya.b.INDEX, "get", "(I)Ljava/lang/Object;", "safeGet", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "getDataListJustForAdapter", "", "getListInfo", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Ljava/lang/Class;", "clazz", "", "getListOfType", "getLastItemOfType", "(Ljava/lang/Class;)Ljava/lang/Object;", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "setTAG", "(Ljava/lang/String;)V", "dataList", "Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "getDataList", "()Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;", "setDataList", "(Lcom/tencent/mm/plugin/finder/feed/model/internal/DataBuffer;)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class DataStore<T> {
    private java.lang.String TAG = "Finder." + getClass().getSimpleName() + "_@" + hashCode();
    private com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataList = new com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<>(new java.util.ArrayList());

    public final T get(int index) {
        return this.dataList.get(index);
    }

    public final com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> getDataList() {
        return this.dataList;
    }

    public final com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> getDataListJustForAdapter() {
        return this.dataList;
    }

    public final T getLast() {
        return (T) kz5.n0.k0(this.dataList);
    }

    public final <E> E getLastItemOfType(java.lang.Class<E> clazz) {
        T t17;
        kotlin.jvm.internal.o.g(clazz, "clazz");
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataBuffer = this.dataList;
        java.util.ListIterator<T> listIterator = dataBuffer.listIterator(dataBuffer.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                t17 = null;
                break;
            }
            t17 = listIterator.previous();
            if (clazz.isInstance(t17)) {
                break;
            }
        }
        if (t17 != null) {
            return (E) t17;
        }
        return null;
    }

    public final java.lang.String getListInfo() {
        java.lang.String str = "DataStore: info count: " + this.dataList.size();
        com.tencent.mars.xlog.Log.i(getTAG(), str);
        int i17 = 0;
        for (T t17 : this.dataList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mars.xlog.Log.i(getTAG(), "DataStore:index " + i17 + " obj:" + t17);
            i17 = i18;
        }
        return str;
    }

    public final <E> java.util.List<E> getListOfType(java.lang.Class<E> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t17 : this.dataList) {
            if (clazz.isInstance(t17)) {
                arrayList.add(t17);
            }
        }
        return arrayList;
    }

    public final int getSize() {
        return this.dataList.size();
    }

    public java.lang.String getTAG() {
        return this.TAG;
    }

    public final boolean isEmpty() {
        return this.dataList.isEmpty();
    }

    public final T safeGet(int index) {
        if (index < 0 || index >= this.dataList.size()) {
            return null;
        }
        return this.dataList.get(index);
    }

    public final void setDataList(com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataBuffer) {
        kotlin.jvm.internal.o.g(dataBuffer, "<set-?>");
        this.dataList = dataBuffer;
    }

    public void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.TAG = str;
    }
}
