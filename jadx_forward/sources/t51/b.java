package t51;

/* loaded from: classes15.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final u51.a f497241a;

    public b(android.content.Context context, v51.f fVar) {
        u51.a aVar = new u51.a(2);
        this.f497241a = aVar;
        aVar.f506323k = context;
        aVar.f506314b = fVar;
    }

    public void a(w51.g gVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        u51.a aVar = this.f497241a;
        gVar.f524499g = aVar;
        android.content.Context context = aVar.f506323k;
        gVar.b();
        android.content.Context context2 = gVar.f524496d;
        gVar.f524502m = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559372cx);
        gVar.f524501i = android.view.animation.AnimationUtils.loadAnimation(context2, com.p314xaae8f345.mm.R.C30854x2dc211.f559373cy);
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.byu, gVar.f524497e);
        android.widget.TextView textView = (android.widget.TextView) gVar.f524497e.findViewById(com.p314xaae8f345.mm.R.id.okp);
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) gVar.f524497e.findViewById(com.p314xaae8f345.mm.R.id.m99);
        android.widget.Button button = (android.widget.Button) gVar.f524497e.findViewById(com.p314xaae8f345.mm.R.id.azv);
        android.widget.Button button2 = (android.widget.Button) gVar.f524497e.findViewById(com.p314xaae8f345.mm.R.id.azm);
        button.setTag("submit");
        button2.setTag("cancel");
        button.setOnClickListener(gVar);
        button2.setOnClickListener(gVar);
        gVar.f524499g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574238hj0);
        } else {
            gVar.f524499g.getClass();
            str = null;
        }
        button.setText(str);
        gVar.f524499g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hiu);
        } else {
            gVar.f524499g.getClass();
            str2 = null;
        }
        button2.setText(str2);
        gVar.f524499g.getClass();
        if (android.text.TextUtils.isEmpty(null)) {
            str3 = "";
        } else {
            gVar.f524499g.getClass();
            str3 = null;
        }
        textView.setText(str3);
        gVar.f524499g.getClass();
        button.setTextColor(-15028967);
        gVar.f524499g.getClass();
        button2.setTextColor(-1979711488);
        gVar.f524499g.getClass();
        textView.setTextColor(-16777216);
        gVar.f524499g.getClass();
        relativeLayout.setBackgroundColor(-657931);
        gVar.f524499g.getClass();
        float f17 = 24;
        button.setTextSize(f17);
        gVar.f524499g.getClass();
        button2.setTextSize(f17);
        gVar.f524499g.getClass();
        textView.setTextSize(f17);
        u51.a aVar2 = gVar.f524499g;
        boolean[] zArr = aVar2.f506319g;
        w51.n nVar = gVar.f524508p;
        if (nVar.f524522a == null) {
            nVar.f524522a = null;
        }
        nVar.f524531j = zArr;
        nVar.f524529h = 17;
        if (aVar2.f506315c != null) {
            nVar.f524545x = new w51.f(gVar);
        }
        java.util.Calendar calendar = aVar2.f506321i;
        java.lang.String str4 = gVar.f524510r;
        if (calendar == null || aVar2.f506322j == null) {
            if (calendar == null) {
                java.util.Calendar calendar2 = aVar2.f506322j;
                if (calendar2 != null && calendar2.get(1) > 2100) {
                    com.p314xaae8f345.mm.ui.yk.b(str4, "initWheelTime: The endDate should not be later than 2100, set endDate to null", new java.lang.Object[0]);
                    gVar.f524499g.f506321i = null;
                }
            } else if (calendar.get(1) < 1900) {
                com.p314xaae8f345.mm.ui.yk.b(str4, "initWheelTime: The startDate can not as early as 1900, set startDate to null", new java.lang.Object[0]);
                gVar.f524499g.f506321i = null;
            }
        } else if (calendar.getTimeInMillis() > gVar.f524499g.f506322j.getTimeInMillis()) {
            com.p314xaae8f345.mm.ui.yk.b(str4, "initWheelTime: startDate can't be later than endDate, set startDate to null", new java.lang.Object[0]);
            gVar.f524499g.f506321i = null;
        }
        u51.a aVar3 = gVar.f524499g;
        java.util.Calendar calendar3 = aVar3.f506321i;
        java.util.Calendar calendar4 = aVar3.f506322j;
        if (calendar3 == null && calendar4 != null) {
            int i39 = calendar4.get(1);
            int i47 = calendar4.get(2) + 1;
            int i48 = calendar4.get(5);
            int i49 = nVar.f524532k;
            if (i39 > i49) {
                nVar.f524533l = i39;
                nVar.f524535n = i47;
                nVar.f524537p = i48;
            } else if (i39 == i49) {
                int i57 = nVar.f524534m;
                if (i47 > i57) {
                    nVar.f524533l = i39;
                    nVar.f524535n = i47;
                    nVar.f524537p = i48;
                } else if (i47 == i57 && i48 > nVar.f524536o) {
                    nVar.f524533l = i39;
                    nVar.f524535n = i47;
                    nVar.f524537p = i48;
                }
            }
        } else if (calendar3 != null && calendar4 == null) {
            int i58 = calendar3.get(1);
            int i59 = calendar3.get(2) + 1;
            int i66 = calendar3.get(5);
            int i67 = nVar.f524533l;
            if (i58 < i67) {
                nVar.f524534m = i59;
                nVar.f524536o = i66;
                nVar.f524532k = i58;
            } else if (i58 == i67) {
                int i68 = nVar.f524535n;
                if (i59 < i68) {
                    nVar.f524534m = i59;
                    nVar.f524536o = i66;
                    nVar.f524532k = i58;
                } else if (i59 == i68 && i66 < nVar.f524537p) {
                    nVar.f524534m = i59;
                    nVar.f524536o = i66;
                    nVar.f524532k = i58;
                }
            }
        } else if (calendar3 != null && calendar4 != null) {
            nVar.f524532k = calendar3.get(1);
            nVar.f524533l = calendar4.get(1);
            nVar.f524534m = calendar3.get(2) + 1;
            nVar.f524535n = calendar4.get(2) + 1;
            nVar.f524536o = calendar3.get(5);
            nVar.f524537p = calendar4.get(5);
            nVar.f524538q = calendar3.get(11);
            nVar.f524539r = calendar3.get(12);
            nVar.f524540s = calendar4.get(11);
            nVar.f524541t = calendar4.get(12);
        }
        if (!gVar.f524511s) {
            u51.a aVar4 = gVar.f524499g;
            java.util.Calendar calendar5 = aVar4.f506321i;
            if (calendar5 != null && aVar4.f506322j != null) {
                java.util.Calendar calendar6 = aVar4.f506320h;
                if (calendar6 == null || calendar6.getTimeInMillis() < gVar.f524499g.f506321i.getTimeInMillis()) {
                    u51.a aVar5 = gVar.f524499g;
                    aVar5.f506320h = aVar5.f506321i;
                } else if (gVar.f524499g.f506320h.getTimeInMillis() > gVar.f524499g.f506322j.getTimeInMillis()) {
                    u51.a aVar6 = gVar.f524499g;
                    aVar6.f506320h = aVar6.f506322j;
                }
            } else if (calendar5 != null) {
                aVar4.f506320h = calendar5;
            } else {
                java.util.Calendar calendar7 = aVar4.f506322j;
                if (calendar7 != null) {
                    aVar4.f506320h = calendar7;
                }
            }
        }
        java.util.Calendar calendar8 = gVar.f524499g.f506320h;
        if (calendar8 == null) {
            java.util.Calendar calendar9 = java.util.Calendar.getInstance();
            calendar9.setTimeInMillis(java.lang.System.currentTimeMillis());
            i17 = calendar9.get(1);
            i18 = calendar9.get(2);
            i19 = calendar9.get(5);
            i27 = calendar9.get(11);
            i28 = calendar9.get(12);
            i29 = calendar9.get(13);
        } else {
            i17 = calendar8.get(1);
            i18 = gVar.f524499g.f506320h.get(2);
            i19 = gVar.f524499g.f506320h.get(5);
            i27 = gVar.f524499g.f506320h.get(11);
            i28 = gVar.f524499g.f506320h.get(12);
            i29 = gVar.f524499g.f506320h.get(13);
        }
        nVar.f524542u = i17;
        nVar.f524523b = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.pta);
        nVar.f524524c = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.jqd);
        nVar.f524525d = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.cqu);
        int i69 = nVar.f524532k;
        int i76 = nVar.f524533l;
        android.content.Context context3 = nVar.A;
        o51.f fVar = new o51.f(i69, i76, context3);
        nVar.f524530i = fVar;
        nVar.f524523b.m48595x6cab2c8d(fVar);
        nVar.f524523b.m48596x940d026a(i17 - nVar.f524532k);
        nVar.f524523b.m48600xc1f6fb8c(nVar.f524529h);
        int i77 = nVar.f524532k;
        int i78 = nVar.f524533l;
        if (i77 == i78) {
            nVar.f524524c.m48595x6cab2c8d(new o51.d(nVar.f524534m, nVar.f524535n, new o51.b(context3)));
            nVar.f524524c.m48596x940d026a((i18 + 1) - nVar.f524534m);
        } else if (i17 == i77) {
            nVar.f524524c.m48595x6cab2c8d(new o51.d(nVar.f524534m, 12, new o51.b(context3)));
            nVar.f524524c.m48596x940d026a((i18 + 1) - nVar.f524534m);
        } else if (i17 == i78) {
            nVar.f524524c.m48595x6cab2c8d(new o51.d(1, nVar.f524535n, new o51.b(context3)));
            nVar.f524524c.m48596x940d026a(i18);
        } else if (nVar.f524544w && i17 - 1 == i77) {
            nVar.f524524c.m48595x6cab2c8d(new o51.d(nVar.f524534m, 12, new o51.b(context3)));
            nVar.f524524c.m48596x940d026a((i18 + 1) - nVar.f524534m);
        } else {
            nVar.f524524c.m48595x6cab2c8d(new o51.d(1, 12, new o51.b(context3)));
            nVar.f524524c.m48596x940d026a(i18);
        }
        nVar.f524524c.m48600xc1f6fb8c(nVar.f524529h);
        int i79 = nVar.f524544w ? i17 - 1 : i17;
        int i86 = nVar.f524532k;
        int i87 = nVar.f524533l;
        java.util.List list = nVar.f524547z;
        java.util.List list2 = nVar.f524546y;
        if (i86 == i87 && nVar.f524534m == nVar.f524535n) {
            int i88 = i18 + 1;
            if (list2.contains(java.lang.String.valueOf(i88))) {
                if (nVar.f524537p > 31) {
                    nVar.f524537p = 31;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, nVar.f524537p));
            } else if (list.contains(java.lang.String.valueOf(i88))) {
                if (nVar.f524537p > 30) {
                    nVar.f524537p = 30;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, nVar.f524537p));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                if (nVar.f524537p > 28) {
                    nVar.f524537p = 28;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, nVar.f524537p));
            } else {
                if (nVar.f524537p > 29) {
                    nVar.f524537p = 29;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, nVar.f524537p));
            }
            nVar.f524525d.m48596x940d026a(i19 - nVar.f524536o);
        } else if (i79 == i86 && (i38 = i18 + 1) == nVar.f524534m) {
            if (list2.contains(java.lang.String.valueOf(i38))) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, 31));
            } else if (list.contains(java.lang.String.valueOf(i38))) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, 30));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, 28));
            } else {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(nVar.f524536o, 29));
            }
            nVar.f524525d.m48596x940d026a(i19 - nVar.f524536o);
        } else if (i79 == i87 && (i37 = i18 + 1) == nVar.f524535n) {
            if (list2.contains(java.lang.String.valueOf(i37))) {
                if (nVar.f524537p > 31) {
                    nVar.f524537p = 31;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, nVar.f524537p));
            } else if (list.contains(java.lang.String.valueOf(i37))) {
                if (nVar.f524537p > 30) {
                    nVar.f524537p = 30;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, nVar.f524537p));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                if (nVar.f524537p > 28) {
                    nVar.f524537p = 28;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, nVar.f524537p));
            } else {
                if (nVar.f524537p > 29) {
                    nVar.f524537p = 29;
                }
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, nVar.f524537p));
            }
            nVar.f524525d.m48596x940d026a(i19 - 1);
        } else {
            int i89 = i18 + 1;
            if (list2.contains(java.lang.String.valueOf(i89))) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, 31));
            } else if (list.contains(java.lang.String.valueOf(i89))) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, 30));
            } else if ((i79 % 4 != 0 || i79 % 100 == 0) && i79 % 400 != 0) {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, 28));
            } else {
                nVar.f524525d.m48595x6cab2c8d(new o51.d(1, 29));
            }
            nVar.f524525d.m48596x940d026a(i19 - 1);
        }
        nVar.f524525d.m48600xc1f6fb8c(nVar.f524529h);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.h1w);
        nVar.f524526e = c11323x28056480;
        c11323x28056480.m48595x6cab2c8d(new o51.d(nVar.f524538q, nVar.f524540s));
        nVar.f524526e.m48596x940d026a(i27 - nVar.f524538q);
        nVar.f524526e.m48600xc1f6fb8c(nVar.f524529h);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x280564802 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.jk7);
        nVar.f524527f = c11323x280564802;
        int i96 = nVar.f524538q;
        if (i27 == i96 && i96 == nVar.f524540s) {
            c11323x280564802.m48595x6cab2c8d(new o51.d(nVar.f524539r, nVar.f524541t));
            if (i28 < nVar.f524539r) {
                nVar.f524527f.m48596x940d026a(0);
            } else {
                int i97 = nVar.f524541t;
                if (i28 > i97) {
                    nVar.f524527f.m48596x940d026a(i97);
                } else {
                    nVar.f524527f.m48596x940d026a(i28);
                }
            }
        } else if (i27 == i96) {
            c11323x280564802.m48595x6cab2c8d(new o51.d(nVar.f524539r, 59));
            int i98 = nVar.f524539r;
            if (i28 < i98) {
                nVar.f524527f.m48596x940d026a(0);
            } else {
                nVar.f524527f.m48596x940d026a(i28 - i98);
            }
        } else if (i27 == nVar.f524540s) {
            c11323x280564802.m48595x6cab2c8d(new o51.d(0, nVar.f524541t));
            int i99 = nVar.f524541t;
            if (i28 >= i99) {
                nVar.f524527f.m48596x940d026a(i99);
            } else {
                nVar.f524527f.m48596x940d026a(i28);
            }
        } else {
            c11323x280564802.m48595x6cab2c8d(new o51.d(0, 59));
            nVar.f524527f.m48596x940d026a(i28);
        }
        nVar.f524527f.m48600xc1f6fb8c(nVar.f524529h);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x280564803 = (com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) nVar.f524522a.findViewById(com.p314xaae8f345.mm.R.id.mfv);
        nVar.f524528g = c11323x280564803;
        c11323x280564803.m48595x6cab2c8d(new o51.d(0, 59));
        nVar.f524528g.m48596x940d026a(i29);
        nVar.f524528g.m48600xc1f6fb8c(nVar.f524529h);
        nVar.f524526e.m48604x88423923(new w51.l(nVar));
        nVar.f524523b.m48604x88423923(new w51.k(nVar));
        nVar.f524524c.m48604x88423923(new w51.j(nVar));
        nVar.b(nVar.f524525d);
        nVar.b(nVar.f524526e);
        nVar.b(nVar.f524527f);
        nVar.b(nVar.f524528g);
        if (nVar.f524531j.length != 6) {
            throw new java.lang.IllegalArgumentException("type[] length is not 6");
        }
        java.util.Iterator it = ((java.util.ArrayList) nVar.e()).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480) it.next()).setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -1, 1.0f));
        }
        if (nVar.f524544w && i17 == 2) {
            nVar.f524524c.e(0);
            nVar.f524525d.e(0);
            nVar.f524524c.invalidate();
            nVar.f524525d.invalidate();
        }
        if (gVar.f524509q.getResources().getConfiguration().locale.getLanguage().endsWith("zh")) {
            gVar.f524499g.getClass();
            gVar.f524499g.getClass();
            gVar.f524499g.getClass();
            gVar.f524499g.getClass();
            gVar.f524499g.getClass();
            gVar.f524499g.getClass();
            nVar.f524523b.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574239hj1));
            nVar.f524524c.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hiy));
            nVar.f524525d.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hiv));
            nVar.f524526e.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hiw));
            nVar.f524527f.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hix));
            nVar.f524528g.m48602x534b3fb2(nVar.f524522a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hiz));
        }
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        android.view.ViewGroup viewGroup = gVar.f524498f;
        if (viewGroup != null) {
            viewGroup.findViewById(com.p314xaae8f345.mm.R.id.knb).setOnTouchListener(gVar.f524504o);
        }
        nVar.f(gVar.f524499g.f506324l);
        u51.a aVar7 = gVar.f524499g;
        s51.c cVar = aVar7.f506326n;
        boolean z17 = aVar7.f506318f;
        nVar.f524523b.m48597x813dbbb(z17);
        nVar.f524524c.m48597x813dbbb(z17);
        nVar.f524525d.m48597x813dbbb(z17);
        nVar.f524526e.m48597x813dbbb(z17);
        nVar.f524527f.m48597x813dbbb(z17);
        nVar.f524528g.m48597x813dbbb(z17);
        gVar.f524499g.getClass();
        gVar.f524499g.getClass();
        nVar.f524525d.f153921p = false;
        nVar.f524524c.f153921p = false;
        nVar.f524523b.f153921p = false;
        nVar.f524526e.f153921p = false;
        nVar.f524527f.f153921p = false;
        nVar.f524528g.f153921p = false;
        int i100 = gVar.f524499g.f506327o;
    }

    public t51.b b(java.util.Calendar calendar, java.util.Calendar calendar2) {
        u51.a aVar = this.f497241a;
        aVar.f506321i = calendar;
        aVar.f506322j = calendar2;
        return this;
    }
}
