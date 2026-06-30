package com.tencent.matrix.battery.accumulate.persist;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b&\u0018\u0000 ,2\u00020\u0001:\u0001-J#\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\bH\u0004J0\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0004J\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0004J4\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\rH\u0004J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u0013\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001f\u001a\u00020\u0017H\u0016R\"\u0010 \u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010&\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\"\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010!\u001a\u0004\b*\u0010#\"\u0004\b+\u0010%¨\u0006."}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattParcelable;", "Landroid/os/Parcelable;", "R", "Lkotlin/Function0;", "block", "lock", "(Lyz5/a;)Ljava/lang/Object;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "", "", "asMutable", "K", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "field", "safe", "Landroid/os/Parcel;", "parcel", "Ljz5/f0;", "readFromParcel", "clear", "dest", "", "flags", "writeToParcel", "describeContents", "", "other", "", "equals", "hashCode", "fromDecode", "Z", "getFromDecode", "()Z", "setFromDecode", "(Z)V", "verMatch", "getVerMatch", "setVerMatch", "canEdit", "getCanEdit", "setCanEdit", "Companion", "mh/l", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public abstract class FlattParcelable implements android.os.Parcelable {
    public static final mh.l Companion = new mh.l(null);
    private static final java.lang.String TAG = "MicroMsg.proc.FlattParcelable";
    private boolean canEdit;
    private boolean fromDecode;
    private boolean verMatch = true;

    public static final int access$figureVerForDecode(com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable) {
        flattParcelable.getClass();
        com.tencent.matrix.battery.accumulate.persist.a aVar = com.tencent.matrix.battery.accumulate.persist.a.f52553a;
        return flattParcelable.getCurrVer() + 16000;
    }

    public final <T> java.util.List<T> asMutable(java.util.List<? extends T> list) {
        kotlin.jvm.internal.o.g(list, "<this>");
        return kotlin.jvm.internal.m0.b(list);
    }

    public void clear() {
        mh.n nVar = new mh.n(this);
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            ((ku5.t0) ku5.t0.f312615d).g(nVar);
        } else {
            nVar.run();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        com.tencent.matrix.battery.accumulate.persist.a aVar = com.tencent.matrix.battery.accumulate.persist.a.f52553a;
        kotlin.jvm.internal.o.e(other, "null cannot be cast to non-null type com.tencent.matrix.battery.accumulate.persist.FlattParcelable");
        com.tencent.matrix.battery.accumulate.persist.FlattParcelable flattParcelable = (com.tencent.matrix.battery.accumulate.persist.FlattParcelable) other;
        java.util.List<java.lang.reflect.Field> f17 = aVar.f(getClass());
        if (f17.size() == getSize()) {
            f17.size();
            flattParcelable.getSize();
        }
        if (f17.isEmpty()) {
            return true;
        }
        for (java.lang.reflect.Field field : f17) {
            if (!kotlin.jvm.internal.o.b(field.get(this), field.get(flattParcelable))) {
                return false;
            }
        }
        return true;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public abstract int getCurrVer();

    public final boolean getFromDecode() {
        return this.fromDecode;
    }

    public abstract int getSize();

    public final boolean getVerMatch() {
        return this.verMatch;
    }

    public int hashCode() {
        return super.hashCode() + 1919 + 810;
    }

    public <R> R lock(yz5.a block) {
        R r17;
        kotlin.jvm.internal.o.g(block, "block");
        synchronized (this) {
            this.canEdit = true;
            r17 = (R) block.invoke();
            this.canEdit = false;
        }
        return r17;
    }

    public void readFromParcel(android.os.Parcel parcel) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        lock(new mh.o(parcel, this));
    }

    public final <T> java.util.List<T> safe(java.util.List<? extends T> field) {
        kotlin.jvm.internal.o.g(field, "field");
        boolean z17 = !this.canEdit;
        if (mh.b.a()) {
            com.tencent.mars.xlog.Log.i(TAG, "visitList: readOnly=" + z17);
        }
        return z17 ? kz5.n0.S0(field) : asMutable(field);
    }

    public final void setCanEdit(boolean z17) {
        this.canEdit = z17;
    }

    public final void setFromDecode(boolean z17) {
        this.fromDecode = z17;
    }

    public final void setVerMatch(boolean z17) {
        this.verMatch = z17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        lock(new mh.p(dest, this, i17));
    }

    public final <K, V> java.util.Map<K, V> asMutable(java.util.Map<K, ? extends V> map) {
        kotlin.jvm.internal.o.g(map, "<this>");
        return kotlin.jvm.internal.m0.c(map);
    }

    public final <K, V> java.util.Map<K, V> safe(java.util.Map<K, ? extends V> field) {
        kotlin.jvm.internal.o.g(field, "field");
        boolean z17 = !this.canEdit;
        if (mh.b.a()) {
            com.tencent.mars.xlog.Log.i(TAG, "visitMap: readOnly=" + z17);
        }
        return z17 ? kz5.c1.s(field) : asMutable(field);
    }
}
