package hu0;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f366558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.o f366559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hu0.l f366560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gu0.k2 k2Var, hu0.o oVar, hu0.l lVar) {
        super(2);
        this.f366558d = k2Var;
        this.f366559e = oVar;
        this.f366560f = lVar;
    }

    public static final void a(hu0.o oVar, hu0.l lVar, gu0.k2 k2Var, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.ControlUIC", "exportVideoForReedit failed, " + str);
        hu0.o.P6(oVar, null, new hu0.e(lVar, k2Var), 1, null);
    }

    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [yz5.a, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v32 */
    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e;
        hu0.d dVar;
        ?? r96;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b;
        jz5.f0 f0Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        gu0.k2 k2Var = this.f366558d;
        hu0.l lVar = this.f366560f;
        hu0.o oVar = this.f366559e;
        if (booleanValue) {
            if (str == null || str.length() == 0) {
                java.lang.String videoPath = k2Var.f357279v;
                if (videoPath == null || videoPath.length() == 0) {
                    a(oVar, lVar, k2Var, "videoPath is null or empty");
                } else {
                    java.lang.String videoCheckSum = k2Var.f357280w;
                    if (videoCheckSum == null || videoCheckSum.length() == 0) {
                        a(oVar, lVar, k2Var, "checksum is null or empty");
                    } else {
                        eu0.q newReeditParams = k2Var.C;
                        if (newReeditParams == null) {
                            a(oVar, lVar, k2Var, "reeditQueryParams is null");
                        } else {
                            r45.mi0 effectEditInfo = k2Var.D;
                            if (effectEditInfo == null) {
                                a(oVar, lVar, k2Var, "reeditEffectEditInfo is null");
                            } else {
                                r45.ab4 localCreateTemplateInfo = k2Var.E;
                                if (localCreateTemplateInfo == null) {
                                    a(oVar, lVar, k2Var, "reeditLocalCreateTemplateInfo is null");
                                } else {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.ControlUIC", "exportVideoForReedit success");
                                    oVar.O6();
                                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = lVar.m158354x19263085();
                                    com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e activityC10926xa2f37a4e2 = m158354x19263085 instanceof com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e ? (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8.ActivityC10926xa2f37a4e) m158354x19263085 : null;
                                    if (activityC10926xa2f37a4e2 != null) {
                                        hu0.d dVar2 = new hu0.d(oVar, lVar, k2Var);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCheckSum, "videoCheckSum");
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newReeditParams, "newReeditParams");
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effectEditInfo, "effectEditInfo");
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localCreateTemplateInfo, "localCreateTemplateInfo");
                                        try {
                                            ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
                                            a17 = uu2.b.f512802a.a();
                                            activityC10926xa2f37a4e = activityC10926xa2f37a4e2;
                                            dVar = dVar2;
                                            try {
                                                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078.b(2, 0L, videoPath, "", "");
                                                c15635xf0ea441b = b17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b ? (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) b17 : null;
                                                if (c15635xf0ea441b != null) {
                                                    c15635xf0ea441b.f219981z = 1080;
                                                    r96 = 1920;
                                                    c15635xf0ea441b.f219980y = 1920;
                                                } else {
                                                    c15635xf0ea441b = null;
                                                    r96 = b17;
                                                }
                                            } catch (java.lang.Exception e17) {
                                                e = e17;
                                                r96 = 0;
                                            }
                                        } catch (java.lang.Exception e18) {
                                            e = e18;
                                            activityC10926xa2f37a4e = activityC10926xa2f37a4e2;
                                            dVar = dVar2;
                                            r96 = 0;
                                        }
                                        try {
                                            if (c15635xf0ea441b == null) {
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: create media item failed!");
                                                hu0.o.P6((hu0.o) activityC10926xa2f37a4e.U6(hu0.o.class), null, null, 3, null);
                                                dVar.mo152xb9724478();
                                            } else {
                                                android.os.Bundle bundle = a17.M;
                                                if (bundle == null) {
                                                    bundle = new android.os.Bundle();
                                                }
                                                bundle.putParcelableArrayList("media_list", kz5.c0.d(c15635xf0ea441b));
                                                a17.M = bundle;
                                                java.lang.String jSONObject = newReeditParams.b().toString();
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                                                byte[] mo14344x5f01b1f6 = localCreateTemplateInfo.mo14344x5f01b1f6();
                                                byte[] mo14344x5f01b1f62 = effectEditInfo.mo14344x5f01b1f6();
                                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToNewMovieComposingForReedit: reeditParamsJson:");
                                                sb6.append(jSONObject);
                                                sb6.append(", videoPath=");
                                                sb6.append(videoPath);
                                                sb6.append(", effectEditInfoBytes=");
                                                sb6.append(mo14344x5f01b1f62 != null ? mo14344x5f01b1f62.length : 0);
                                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", sb6.toString());
                                                r45.q23 q23Var = new r45.q23();
                                                r45.ko6 ko6Var = new r45.ko6();
                                                ko6Var.f460417i = videoCheckSum;
                                                q23Var.f465134w = ko6Var;
                                                if (ut3.m.f512715a.i(activityC10926xa2f37a4e, 292, 0, 0, a17, 4, 0, false, q23Var, false, false, true, jSONObject, mo14344x5f01b1f6, mo14344x5f01b1f62)) {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: finish self after jump");
                                                    gu0.k2 k2Var2 = activityC10926xa2f37a4e.f150710d;
                                                    if (k2Var2 != null) {
                                                        k2Var2.p(true, new gu0.a(activityC10926xa2f37a4e));
                                                        f0Var = f0Var2;
                                                    } else {
                                                        f0Var = null;
                                                    }
                                                    if (f0Var == null) {
                                                        activityC10926xa2f37a4e.finish();
                                                    }
                                                } else {
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: jump failed");
                                                    hu0.o.P6((hu0.o) activityC10926xa2f37a4e.U6(hu0.o.class), null, null, 3, null);
                                                    dVar.mo152xb9724478();
                                                }
                                            }
                                        } catch (java.lang.Exception e19) {
                                            e = e19;
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "jumpToNewMovieComposingForReedit: exception: " + e.getMessage());
                                            hu0.o.P6((hu0.o) activityC10926xa2f37a4e.U6(hu0.o.class), r96, r96, 3, r96);
                                            dVar.mo152xb9724478();
                                            return f0Var2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return f0Var2;
            }
        }
        a(oVar, lVar, k2Var, "export error: " + str);
        return f0Var2;
    }
}
