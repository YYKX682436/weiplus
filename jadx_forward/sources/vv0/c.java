package vv0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d f521906a;

    /* renamed from: b, reason: collision with root package name */
    public final vv0.a f521907b;

    /* renamed from: c, reason: collision with root package name */
    public final vv0.i f521908c;

    public c(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d, vv0.a aVar, vv0.i updateState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        this.f521906a = c4108x6d452a1d;
        this.f521907b = aVar;
        this.f521908c = updateState;
    }

    public static vv0.c a(vv0.c cVar, com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d, vv0.a aVar, vv0.i updateState, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            c4108x6d452a1d = cVar.f521906a;
        }
        if ((i17 & 2) != 0) {
            aVar = cVar.f521907b;
        }
        if ((i17 & 4) != 0) {
            updateState = cVar.f521908c;
        }
        cVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updateState, "updateState");
        return new vv0.c(c4108x6d452a1d, aVar, updateState);
    }

    /* renamed from: equals */
    public boolean m172689xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv0.c)) {
            return false;
        }
        vv0.c cVar = (vv0.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521906a, cVar.f521906a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521907b, cVar.f521907b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f521908c, cVar.f521908c);
    }

    /* renamed from: hashCode */
    public int m172690x8cdac1b() {
        com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d = this.f521906a;
        int hashCode = (c4108x6d452a1d == null ? 0 : c4108x6d452a1d.hashCode()) * 31;
        vv0.a aVar = this.f521907b;
        return ((hashCode + (aVar != null ? aVar.m172684x8cdac1b() : 0)) * 31) + this.f521908c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172691x9616526c() {
        return "ClipUIState(materialPack=" + this.f521906a + ", selectedData=" + this.f521907b + ", updateState=" + this.f521908c + ')';
    }

    public /* synthetic */ c(com.p314xaae8f345.p457x3304c6.p476x11d36527.C4108x6d452a1d c4108x6d452a1d, vv0.a aVar, vv0.i iVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar2) {
        this((i17 & 1) != 0 ? null : c4108x6d452a1d, (i17 & 2) != 0 ? null : aVar, (i17 & 4) != 0 ? vv0.d.f521909a : iVar);
    }
}
