package fv3;

/* loaded from: classes5.dex */
public abstract class a implements fv3.b {

    /* renamed from: d, reason: collision with root package name */
    public final fv3.c f348515d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f348516e;

    public a(fv3.c status, java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 2) != 0 ? null : str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f348515d = status;
        this.f348516e = str;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.p2007x2e06d1.AbstractC17065x797fe694) status).pluginList.add(this);
    }

    @Override // fv3.b
    /* renamed from: name */
    public java.lang.String mo130495x337a8b() {
        java.lang.String str = this.f348516e;
        return android.text.TextUtils.isEmpty(str) ? getClass().getName() : str;
    }
}
