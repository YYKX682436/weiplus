package u20;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f505403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f505404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u20.h f505405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f505406g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f505407h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f505408i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 f505409m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f505410n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ u20.i f505411o;

    public g(android.app.Activity activity, int i17, u20.h hVar, java.lang.String str, int i18, boolean z17, com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8, java.lang.String str2, u20.i iVar) {
        this.f505403d = activity;
        this.f505404e = i17;
        this.f505405f = hVar;
        this.f505406g = str;
        this.f505407h = i18;
        this.f505408i = z17;
        this.f505409m = c11131x285e79f8;
        this.f505410n = str2;
        this.f505411o = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p956x88360526.C11131x285e79f8 c11131x285e79f8;
        kd0.s2 s2Var;
        nf.g a17;
        android.app.Activity activity = this.f505403d;
        boolean z17 = activity instanceof nf.m;
        int i17 = this.f505404e;
        if (z17 && (a17 = nf.g.a(activity)) != null) {
            a17.f(new u20.f(this.f505405f, i17));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = this.f505406g;
        intent.putExtra("Retr_File_Name", str3);
        intent.putExtra("scene_from", 19);
        intent.putExtra("Retr_Compress_Type", this.f505407h);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_show_success_tips", false);
        if (this.f505408i && (c11131x285e79f8 = this.f505409m) != null && (s2Var = (kd0.s2) i95.n0.c(kd0.s2.class)) != null) {
            ((jd0.d2) s2Var).Bi(intent, c11131x285e79f8);
        }
        java.lang.String str4 = "";
        java.lang.String str5 = this.f505410n;
        if (str5 == null) {
            str5 = "";
        }
        intent.putExtra("shareImageSrc", str5);
        u20.i iVar = this.f505411o;
        u20.d dVar = iVar.f505414d;
        if (dVar == null || (str = dVar.f505397e) == null) {
            str = "";
        }
        intent.putExtra("shareImageCurrentAppId", str);
        u20.d dVar2 = iVar.f505414d;
        if (dVar2 != null && (str2 = dVar2.f505396d) != null) {
            str4 = str2;
        }
        intent.putExtra("shareImageCurrentPath", str4);
        intent.putExtra("from_scene_forward_to_wework", 6);
        intent.putExtra("content_type_forward_to_wework", 2);
        intent.putExtra("Select_Data_Send_To_WeWork", new com.p314xaae8f345.mm.p2610xe8058ca2.C21011xd572f9ed(str3));
        j45.l.v(activity, ".ui.transmit.MsgRetransmitUI", intent, i17);
    }
}
