package xm3;

/* loaded from: classes.dex */
public abstract class a implements xm3.d, java.lang.Cloneable {
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.clone();
    }

    /* renamed from: equals */
    public boolean mo148314xb2c87fbf(java.lang.Object obj) {
        xm3.d dVar = obj instanceof xm3.d ? (xm3.d) obj : null;
        if (dVar != null) {
            return s0(dVar);
        }
        return false;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public final long mo2128x1ed62e84() {
        return v().hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int mo148315x8cdac1b() {
        return getClass().hashCode();
    }

    @Override // xm3.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public xm3.d y0() {
        java.lang.Object clone = super.clone();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(clone, "null cannot be cast to non-null type T of com.tencent.mm.plugin.mvvmlist.BaseMvvmListItem");
        return (xm3.d) clone;
    }

    @Override // xm3.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public boolean s0(xm3.d other) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return mo2128x1ed62e84() == other.mo2128x1ed62e84();
    }
}
