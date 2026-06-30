package ss2;

/* loaded from: classes10.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5, mv2.w0, ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public ry2.o f493488d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f493489e;

    /* renamed from: f, reason: collision with root package name */
    public ya2.b2 f493490f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f493491g;

    /* renamed from: h, reason: collision with root package name */
    public ss2.a0 f493492h;

    /* renamed from: i, reason: collision with root package name */
    public ss2.d f493493i;

    /* renamed from: m, reason: collision with root package name */
    public ss2.d0 f493494m;

    /* renamed from: n, reason: collision with root package name */
    public org.json.JSONObject f493495n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewGroup f493496o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f493497p;

    /* renamed from: q, reason: collision with root package name */
    public int f493498q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f493499r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f493500s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f493489e = "";
        this.f493499r = "";
        this.f493500s = jz5.h.b(new ss2.k(activity));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(ss2.l r8) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss2.l.O6(ss2.l):void");
    }

    public final ry2.o P6() {
        ry2.o oVar = this.f493488d;
        if (oVar != null) {
            return oVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("postDataManager");
        throw null;
    }

    public final android.widget.TextView Q6() {
        return (android.widget.TextView) ((jz5.n) this.f493500s).mo141623x754a37bb();
    }

    public final void R6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f493491g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f493491g = null;
    }

    public final void S6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f493491g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(m158354x19263085(), "", m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f573555ez1), true, false, null);
        this.f493491g = Q;
        if (Q != null) {
            Q.show();
        }
    }

    public final void T6(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.lang.String str) {
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList2 == null || arrayList2.isEmpty()) {
                P6().f482953e = 1;
                P6().f482949c.putStringArrayList("image_file_list", null);
                P6().f482949c.putStringArrayList("video_file_list", null);
            } else {
                if (P6().f482955f == null) {
                    P6().f482955f = new java.util.ArrayList();
                    java.util.ArrayList arrayList3 = P6().f482959j;
                    if (arrayList3 != null) {
                        arrayList3.clear();
                    }
                }
                java.util.ArrayList arrayList4 = P6().f482955f;
                if (arrayList4 != null) {
                    arrayList4.addAll(arrayList2);
                }
                P6().f482953e = 2;
            }
        } else {
            P6().f482955f = new java.util.ArrayList();
            java.util.ArrayList arrayList5 = P6().f482955f;
            if (arrayList5 != null) {
                arrayList5.addAll(arrayList);
            }
            P6().f482953e = 4;
            java.util.ArrayList arrayList6 = P6().f482959j;
            if (arrayList6 != null) {
                arrayList6.clear();
            }
            if (str != null && P6().f482959j == null) {
                P6().f482959j = new java.util.ArrayList();
                java.util.ArrayList arrayList7 = P6().f482959j;
                if (arrayList7 != null) {
                    arrayList7.add(str);
                }
            }
        }
        P6().q();
        ss2.a0 a0Var = this.f493492h;
        if (a0Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "refresh thumbLocalUrl");
            android.os.Bundle bundle = a0Var.A;
            a0Var.f493444m = bundle != null ? bundle.getStringArrayList("video_file_list") : null;
            android.os.Bundle bundle2 = a0Var.A;
            java.lang.String string = bundle2 != null ? bundle2.getString("VIDEO_COVER_URL") : null;
            if (string == null) {
                string = "";
            }
            a0Var.f493445n = string;
            android.os.Bundle bundle3 = a0Var.A;
            java.lang.String string2 = bundle3 != null ? bundle3.getString("VIDEO_FULL_COVER_URL") : null;
            a0Var.f493446o = string2 != null ? string2 : "";
            android.os.Bundle bundle4 = a0Var.A;
            a0Var.f493447p = bundle4 != null ? bundle4.getInt("VIDEO_COVER_QUALITY", 0) : 0;
            android.os.Bundle bundle5 = a0Var.A;
            a0Var.f493449r = bundle5 != null ? bundle5.getStringArrayList("image_file_list") : null;
            android.os.Bundle bundle6 = a0Var.A;
            a0Var.f493453v = bundle6 != null ? bundle6.getIntegerArrayList("image_quality_list") : null;
            android.os.Bundle bundle7 = a0Var.A;
            a0Var.f493451t = bundle7 != null ? bundle7.getStringArrayList("half_image_file_list") : null;
            android.os.Bundle bundle8 = a0Var.A;
            a0Var.f493454w = bundle8 != null ? bundle8.getParcelableArrayList("HALF_RECT_LIST") : null;
            java.util.ArrayList arrayList8 = a0Var.f493449r;
            if (arrayList8 != null) {
            }
            a0Var.f493457z.clear();
            java.util.ArrayList arrayList9 = a0Var.f493444m;
            if (!(arrayList9 == null || arrayList9.isEmpty())) {
                java.util.ArrayList arrayList10 = a0Var.f493444m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList10);
                java.util.Iterator it = arrayList10.iterator();
                while (it.hasNext()) {
                    java.lang.String str2 = (java.lang.String) it.next();
                    java.util.ArrayList arrayList11 = a0Var.f493457z;
                    ss2.n nVar = new ss2.n();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                    nVar.f493504g = str2;
                    nVar.f493501d = true;
                    arrayList11.add(nVar);
                }
                a0Var.f493457z.add(new ss2.m());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a31969 = a0Var.f493441g;
                if (c15327x51a31969 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
                    throw null;
                }
                c15327x51a31969.setVisibility(8);
                android.view.ViewGroup viewGroup = a0Var.f493442h;
                if (viewGroup == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCoverView");
                    throw null;
                }
                viewGroup.setVisibility(0);
                android.view.ViewGroup viewGroup2 = a0Var.f493442h;
                if (viewGroup2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCoverView");
                    throw null;
                }
                viewGroup2.setOnClickListener(new ss2.u(a0Var));
                pm0.v.O("Finder_Post_Create_Video_Thumb", new ss2.w(a0Var));
                return;
            }
            java.util.ArrayList arrayList12 = a0Var.f493449r;
            if (arrayList12 == null || arrayList12.size() <= 0) {
                a0Var.f493457z.add(new ss2.m());
                android.view.ViewGroup viewGroup3 = a0Var.f493442h;
                if (viewGroup3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCoverView");
                    throw null;
                }
                viewGroup3.setVisibility(8);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a319692 = a0Var.f493441g;
                if (c15327x51a319692 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
                    throw null;
                }
                c15327x51a319692.setVisibility(0);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a319693 = a0Var.f493441g;
                if (c15327x51a319693 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
                    throw null;
                }
                c15327x51a319693.b(a0Var.f493457z.size());
                a0Var.e();
                return;
            }
            java.util.ArrayList arrayList13 = a0Var.f493449r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList13);
            java.util.Iterator it6 = arrayList13.iterator();
            while (it6.hasNext()) {
                java.lang.String str3 = (java.lang.String) it6.next();
                java.util.ArrayList arrayList14 = a0Var.f493457z;
                ss2.n nVar2 = new ss2.n();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                nVar2.f493504g = str3;
                nVar2.f493501d = false;
                arrayList14.add(nVar2);
            }
            a0Var.f493457z.add(new ss2.m());
            android.view.ViewGroup viewGroup4 = a0Var.f493442h;
            if (viewGroup4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("videoCoverView");
                throw null;
            }
            viewGroup4.setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a319694 = a0Var.f493441g;
            if (c15327x51a319694 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
                throw null;
            }
            c15327x51a319694.setVisibility(0);
            ((ku5.t0) ku5.t0.f394148d).h(new ss2.r(a0Var), "Finder_Post_Question_Create_Image_Thumb");
            a0Var.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dca;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null) {
            return;
        }
        if ((i17 == 4387 || i17 == 4388) && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("key_select_video_list");
            java.util.ArrayList<java.lang.String> stringArrayListExtra2 = intent.getStringArrayListExtra("key_select_image_list");
            if (stringArrayListExtra != null) {
                java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.QAPostMainUIC", "video %s", it.next());
                }
            }
            if (stringArrayListExtra2 != null) {
                java.util.Iterator<java.lang.String> it6 = stringArrayListExtra2.iterator();
                while (it6.hasNext()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.QAPostMainUIC", "image %s", it6.next());
                }
            }
            T6(stringArrayListExtra, stringArrayListExtra2, intent.getStringExtra("video_thumb_path"));
        }
        if (i17 == 8485 && i18 == -1) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra3 = intent.getStringArrayListExtra("sns_gallery_temp_paths");
            ss2.a0 a0Var = this.f493492h;
            if (a0Var != null && a0Var.d() == 4) {
                P6().f482955f = new java.util.ArrayList();
                T6(stringArrayListExtra3, null, null);
            } else {
                ss2.a0 a0Var2 = this.f493492h;
                if (a0Var2 != null && a0Var2.d() == 2) {
                    P6().f482955f = new java.util.ArrayList();
                    T6(null, stringArrayListExtra3, null);
                }
            }
        }
        if (i17 == 8485 && i18 == -1 && intent.getBooleanExtra("key_is_delete", false)) {
            P6().f482955f = new java.util.ArrayList();
            T6(null, null, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String m76281x194b99df;
        org.json.JSONObject jSONObject;
        this.f493488d = new ry2.o(m158359x1e885992());
        P6().f482949c.putInt("KEY_POST_OBJECT_TYPE", 6);
        m158359x1e885992().getBooleanExtra("KEY_FINDER_MEMBER_VIDEO", false);
        P6().f482953e = 1;
        this.f493498q = m158359x1e885992().getIntExtra("key_member_qa_type", 0);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("key_author_finder_name");
        java.lang.String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f493499r = stringExtra;
        java.lang.String e17 = xy2.c.e(m158354x19263085());
        this.f493489e = e17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(e17)) {
            this.f493490f = ya2.h.f542017a.b(this.f493489e);
        }
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.l0s);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        this.f493496o = (android.view.ViewGroup) mo144222x4ff8c0f0;
        boolean[] zArr = {false};
        Q6().setOnTouchListener(new ss2.i(zArr));
        Q6().setOnClickListener(new ss2.j(zArr, this));
        ss2.d dVar = new ss2.d(m158354x19263085());
        android.content.Intent intent = m158359x1e885992();
        ry2.o P6 = P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        android.os.Bundle postData = P6.f482949c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postData, "postData");
        java.lang.String g17 = intent.getIntExtra("key_member_qa_type", 0) == 3 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.lep) : "";
        android.app.Activity activity = dVar.f493464d;
        android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.l09);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        dVar.f493465e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        android.view.View findViewById2 = activity.findViewById(com.p314xaae8f345.mm.R.id.o5h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        dVar.f493466f = (android.widget.TextView) findViewById2;
        dVar.b().setHint(g17);
        dVar.c().setText("");
        dVar.c().setVisibility(8);
        ss2.c cVar = new ss2.c(dVar);
        dVar.a();
        dVar.b().addTextChangedListener(cVar);
        this.f493493i = dVar;
        ss2.d0 d0Var = new ss2.d0(m158354x19263085());
        android.content.Intent intent2 = m158359x1e885992();
        ry2.o P62 = P6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent2, "intent");
        android.os.Bundle postData2 = P62.f482949c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postData2, "postData");
        d0Var.f493471e = intent2.getIntExtra("key_member_qa_type", 0);
        android.app.Activity activity2 = d0Var.f493470d;
        boolean z17 = (xy2.c.e(activity2).length() > 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(intent2.getStringExtra("key_author_finder_name"), xy2.c.e(activity2));
        d0Var.f493477n = z17;
        if (z17) {
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            d0Var.f493478o = 1;
        }
        android.view.View findViewById3 = activity2.findViewById(com.p314xaae8f345.mm.R.id.pwe);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        d0Var.f493472f = findViewById3;
        android.view.View findViewById4 = activity2.findViewById(com.p314xaae8f345.mm.R.id.pwf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        d0Var.f493473g = (android.widget.ImageView) findViewById4;
        android.view.View findViewById5 = activity2.findViewById(com.p314xaae8f345.mm.R.id.pwh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        d0Var.f493474h = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = activity2.findViewById(com.p314xaae8f345.mm.R.id.q1o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        d0Var.f493475i = findViewById6;
        android.view.View findViewById7 = activity2.findViewById(com.p314xaae8f345.mm.R.id.pwg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        d0Var.f493476m = findViewById7;
        if (d0Var.f493471e != 3 || d0Var.f493477n) {
            android.view.View view = d0Var.f493472f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = d0Var.f493472f;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if ((!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).vk() || d0Var.f493471e == 2 || d0Var.f493477n) ? false : true) {
            android.view.View view3 = d0Var.f493475i;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneBtn");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = d0Var.f493475i;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneBtn");
                throw null;
            }
            view4.setOnClickListener(new ss2.b0(d0Var));
        } else {
            android.view.View view5 = d0Var.f493475i;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneBtn");
                throw null;
            }
            view5.setOnClickListener(ss2.c0.f493463d);
            android.view.View view6 = d0Var.f493475i;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchSceneBtn");
                throw null;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/question/QASwitchSceneWidget", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        d0Var.a();
        this.f493494m = d0Var;
        android.view.ViewGroup viewGroup = this.f493496o;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup.removeAllViews();
        android.app.Activity m80379x76847179 = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m80379x76847179, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ss2.a0 a0Var = new ss2.a0((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m80379x76847179, P6());
        this.f493492h = a0Var;
        android.os.Bundle data = P6().f482949c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        a0Var.A = data;
        android.view.View b17 = a0Var.b();
        android.view.ViewGroup viewGroup2 = this.f493496o;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup2.addView(b17);
        android.view.ViewGroup viewGroup3 = this.f493496o;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaViewContainer");
            throw null;
        }
        viewGroup3.setOnClickListener(null);
        java.lang.System.currentTimeMillis();
        this.f493495n = new org.json.JSONObject();
        long longExtra = m158359x1e885992().getLongExtra("key_ref_feed_id", 0L);
        if (longExtra != 0 && (jSONObject = this.f493495n) != null) {
            jSONObject.put("feedid", pm0.v.u(longExtra));
        }
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("key_jump_id");
        if (stringExtra2 != null) {
            r26.i0.t(stringExtra2, ",", ";", false);
        }
        ft2.b bVar = ft2.b.f348052a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206771b;
        if (c19783xd9a946b7 != null && (m76281x194b99df = c19783xd9a946b7.m76281x194b99df()) != null) {
            str = m76281x194b99df;
        }
        bVar.b(str, ft2.c.f348057e);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        R6();
    }

    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostNotify */
    public void mo56116x1ed18348(long j17, boolean z17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
    }
}
