package hh3;

/* loaded from: classes4.dex */
public class a extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f362988e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f362989f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362990g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f362991h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f362992i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ hh3.d f362993m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(hh3.d dVar, int i17, r35.m3 m3Var, android.os.Bundle bundle, java.util.Map map, java.lang.String str, java.lang.ref.WeakReference weakReference, java.lang.String str2, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f362993m = dVar;
        this.f362988e = bundle;
        this.f362989f = map;
        this.f362990g = str;
        this.f362991h = weakReference;
        this.f362992i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        java.lang.String str;
        long j17 = this.f362988e.getLong("msg_id");
        hh3.d dVar = this.f362993m;
        dVar.f362999h = j17;
        java.util.Map map = this.f362989f;
        java.lang.String str2 = this.f362990g;
        dVar.getClass();
        java.lang.ref.WeakReference weakReference = this.f362991h;
        if (weakReference != null) {
            try {
                if (weakReference.get() != null) {
                    dVar.f362998g = weakReference;
                    if ("new_tmpl_type_succeed_contact_window".equals((java.lang.String) map.get(str2 + ".window_template.$type"))) {
                        java.lang.String str3 = (java.lang.String) map.get(str2 + ".window_template.title");
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        if (str3 == null) {
                            str3 = "";
                        }
                        dVar.f363000i = str3;
                        java.lang.String str4 = (java.lang.String) map.get(str2 + ".window_template.cancel_wording");
                        if (str4 == null) {
                            str4 = "";
                        }
                        dVar.f363001m = str4;
                        java.lang.String str5 = (java.lang.String) map.get(str2 + ".window_template.confirm_wording");
                        if (str5 == null) {
                            str5 = "";
                        }
                        dVar.f363002n = str5;
                        java.lang.String str6 = (java.lang.String) map.get(str2 + ".origin_username");
                        if (str6 == null) {
                            str6 = "";
                        }
                        dVar.f363003o = str6;
                        java.lang.String str7 = (java.lang.String) map.get(str2 + ".heir_username");
                        if (str7 == null) {
                            str7 = "";
                        }
                        dVar.f363004p = str7;
                        java.lang.String str8 = (java.lang.String) map.get(str2 + ".succeed_ticket");
                        if (str8 == null) {
                            str8 = "";
                        }
                        dVar.f363005q = str8;
                        java.util.ArrayList a17 = ih3.p.a(dVar.f363000i);
                        if (a17 != null && a17.size() > 0) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.util.Iterator it = a17.iterator();
                            while (true) {
                                int i17 = 0;
                                if (!it.hasNext()) {
                                    break;
                                }
                                ih3.o oVar = (ih3.o) it.next();
                                if (oVar != null && (str = oVar.f373130b) != null) {
                                    int i18 = oVar.f373129a;
                                    if (i18 == 0) {
                                        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                                        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                                        ((ke0.e) xVar).getClass();
                                        arrayList.add(new android.text.SpannableString(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str)));
                                    } else if (i18 == 1) {
                                        while (true) {
                                            java.lang.String str9 = str2 + ".window_template.link_list.link";
                                            if (i17 != 0) {
                                                str9 = str9 + i17;
                                            }
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) map.get(str9))) {
                                                break;
                                            }
                                            java.lang.String str10 = (java.lang.String) map.get(str9 + ".$name");
                                            java.lang.String str11 = (java.lang.String) map.get(str9 + ".$type");
                                            if (str.equals(str10) && "link_plain".equals(str11)) {
                                                java.lang.String str12 = (java.lang.String) map.get(str9 + ".plain");
                                                if (str12 == null) {
                                                    str12 = "";
                                                }
                                                arrayList.add(str12);
                                            }
                                            i17++;
                                        }
                                    }
                                }
                            }
                            java.lang.CharSequence spannableString = new android.text.SpannableString("");
                            java.util.Iterator it6 = arrayList.iterator();
                            while (it6.hasNext()) {
                                spannableString = android.text.TextUtils.concat(spannableString, (java.lang.CharSequence) it6.next());
                            }
                            dVar.f363000i = spannableString.toString();
                        }
                        dVar.e((android.content.Context) weakReference.get());
                        dVar.f362997f = new fh3.a(dVar.f363003o, dVar.f363004p, dVar.f363005q, 1);
                        gm0.j1.d().g(dVar.f362997f);
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.sysmsg.SysMsgHandlerNewLinkSucceedContact", "Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            }
        }
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        dVar.getClass();
        ((ih3.e) k1Var).Di("new_link_succeed_contact", this.f362989f, this.f362988e, this.f362991h, this.f362992i);
    }
}
