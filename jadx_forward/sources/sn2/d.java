package sn2;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf f491657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f491658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491659f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f491660g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf, android.graphics.Bitmap bitmap, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f491657d = serviceC14434x2b82fbf;
        this.f491658e = bitmap;
        this.f491659f = str;
        this.f491660g = str2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf serviceC14434x2b82fbf = this.f491657d;
        android.graphics.Bitmap bitmap = this.f491658e;
        serviceC14434x2b82fbf.f202390t = bitmap;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r rVar = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r();
        java.lang.String str = this.f491659f;
        rVar.d("android.media.metadata.TITLE", str);
        java.lang.String str2 = this.f491660g;
        rVar.d("android.media.metadata.ARTIST", str2);
        rVar.d("android.media.metadata.DISPLAY_TITLE", str);
        rVar.d("android.media.metadata.DISPLAY_SUBTITLE", str2);
        rVar.b("android.media.metadata.ALBUM_ART", bitmap);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 a17 = rVar.a();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = serviceC14434x2b82fbf.f202385o;
        if (f0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaSession");
            throw null;
        }
        f0Var.g(a17);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = serviceC14434x2b82fbf.f202386p;
        if (k0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateBuilder");
            throw null;
        }
        serviceC14434x2b82fbf.i(k0Var.a().f90485d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(serviceC14434x2b82fbf.f202384n, "updateMetadataWithCover - Cover updated");
        return jz5.f0.f384359a;
    }
}
