package u82;

/* loaded from: classes8.dex */
public class a extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f507024x;

    /* renamed from: y, reason: collision with root package name */
    public final r45.qs0 f507025y;

    public a(ak3.c cVar) {
        super(cVar);
        this.f507024x = "";
        this.f507025y = new r45.qs0();
    }

    @Override // jk3.b, jk3.e
    public boolean c(int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f507024x) || com.p314xaae8f345.mm.vfs.w6.j(this.f507024x)) {
            return !(this instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.p3);
        }
        return false;
    }

    @Override // jk3.b
    public boolean x() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f507024x) || com.p314xaae8f345.mm.vfs.w6.j(this.f507024x);
    }
}
