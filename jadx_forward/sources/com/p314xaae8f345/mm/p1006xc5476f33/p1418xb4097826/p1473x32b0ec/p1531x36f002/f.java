package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i f197027d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f197028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f197029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f197030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f197031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f197032i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i iVar, android.graphics.Bitmap bitmap, java.lang.String str, android.graphics.Bitmap bitmap2, android.view.View view, yz5.l lVar) {
        super(0);
        this.f197027d = iVar;
        this.f197028e = bitmap;
        this.f197029f = str;
        this.f197030g = bitmap2;
        this.f197031h = view;
        this.f197032i = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f197027d.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPlayerBackground bitmap size: ");
        android.graphics.Bitmap bitmap = this.f197028e;
        sb6.append(bitmap.getWidth());
        sb6.append('x');
        sb6.append(bitmap.getHeight());
        sb6.append(", fromURL: ");
        java.lang.String str = this.f197029f;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", sb6.toString());
        android.graphics.Bitmap bitmap2 = this.f197030g;
        if (bitmap2 != null) {
            android.view.View view = this.f197031h;
            if (view != null) {
                zl2.r4.f555483a.R2(view, bitmap2);
            }
            this.f197032i.mo146xb9724478(bitmap);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197074b.put(str, new jz5.l(bitmap, bitmap2));
        }
        return jz5.f0.f384359a;
    }
}
