package vd0;

@j95.b
/* loaded from: classes8.dex */
public final class l3 extends i95.w implements wd0.y1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f516993d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f516994e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f516995f;

    public static final void Ai(vd0.l3 l3Var, vd0.c3 c3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        l3Var.getClass();
        java.util.HashMap b17 = u24.m.f505662a.b(activityC0065xcd7aa112);
        for (java.lang.String str : kz5.n0.S0(c3Var.f516917d.keySet())) {
            a24.i iVar = (a24.i) b17.get(str);
            c3Var.f516917d.put(str, java.lang.Boolean.valueOf(iVar != null ? iVar.q7() : false));
        }
    }

    public static final void Bi(vd0.l3 l3Var, java.lang.String str, java.lang.Integer num) {
        synchronized (l3Var.f516993d) {
            vd0.y2 y2Var = (vd0.y2) l3Var.f516994e.get(str);
            if (y2Var == null) {
                return;
            }
            if (num == null || y2Var.f517076c == num.intValue()) {
                l3Var.f516994e.remove(str);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l3Var.f516995f, str)) {
                    java.util.Set keySet = l3Var.f516994e.keySet();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                    l3Var.f516995f = (java.lang.String) kz5.n0.Y(keySet);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingSearchFeatureService", "removeIndexByTag done, activityTag=" + str + ", remain=" + l3Var.f516994e.size());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5 A[LOOP:3: B:52:0x01af->B:54:0x01b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final vd0.c3 wi(vd0.l3 r43, a24.t r44) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.l3.wi(vd0.l3, a24.t):vd0.c3");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Di(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 r21, java.lang.String r22, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r23) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vd0.l3.Di(androidx.appcompat.app.AppCompatActivity, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final vd0.y2 Ni(java.lang.String str) {
        boolean z17 = !r26.n0.N(str);
        java.util.HashMap hashMap = this.f516994e;
        if (z17) {
            return (vd0.y2) hashMap.get(str);
        }
        java.lang.String str2 = this.f516995f;
        vd0.y2 y2Var = str2 != null ? (vd0.y2) hashMap.get(str2) : null;
        if (y2Var != null) {
            return y2Var;
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        java.util.Set entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.lang.Object W = kz5.n0.W(entrySet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(W, "first(...)");
        java.util.Map.Entry entry = (java.util.Map.Entry) W;
        if (hashMap.size() > 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingSearchFeatureService", "getHolder fallback first index, size=" + hashMap.size());
        }
        this.f516995f = (java.lang.String) entry.getKey();
        return (vd0.y2) entry.getValue();
    }

    public final java.lang.CharSequence Ri(java.lang.String str, java.lang.String str2) {
        int L;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(str);
        if ((str2 == null || str2.length() == 0) || (L = r26.n0.L(str, str2, 0, true, 2, null)) == -1) {
            return f0Var;
        }
        f0Var.c(new android.text.style.ForegroundColorSpan(i65.a.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)), L, str2.length() + L, 33);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    public void Ui(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, wd0.x1 item) {
        vd0.y2 Ni;
        ?? c17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (activityC0065xcd7aa112 == null) {
            return;
        }
        synchronized (this.f516993d) {
            Zi();
            Ni = Ni("");
        }
        if (Ni == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingSearchFeatureService", "onClickSettingItem skip: no available active index, itemKey=" + item.f526314d);
            return;
        }
        a24.t tVar = (a24.t) Ni.f517075b.f516915b.get(item.f526314d);
        a24.i iVar = tVar != null ? tVar.f82439b : null;
        if (iVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SettingSearchFeatureService", "onClickSettingItem skip: key not found, itemKey=" + item.f526314d);
            return;
        }
        a24.t tVar2 = tVar.f82438a;
        android.view.View view = new android.view.View(activityC0065xcd7aa112);
        if (vd0.d3.f516923a[item.f526316f.ordinal()] != 1) {
            c17 = kz5.b0.c(iVar.a7());
        } else if (tVar2 != null) {
            c17 = new java.util.ArrayList();
            java.util.List list = tVar2.f82440c;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((a24.t) it.next()).f82439b);
            }
            boolean z17 = false;
            for (a24.i iVar2 : (java.util.List) u24.m.f505662a.d(tVar2.f82439b, arrayList).f384367e) {
                if (iVar2 == iVar) {
                    z17 = true;
                }
                if (z17) {
                    if (iVar2.Y6() != null && iVar2 != iVar) {
                        break;
                    } else {
                        c17.add(iVar2.a7());
                    }
                }
            }
        } else {
            c17 = kz5.b0.c(iVar.a7());
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_config_target_item", iVar.a7());
        intent.putStringArrayListExtra("key_highlight_item", new java.util.ArrayList<>((java.util.Collection) c17));
        a24.i iVar3 = tVar2 != null ? tVar2.f82439b : null;
        if (!(iVar3 instanceof s24.e)) {
            iVar.r7(activityC0065xcd7aa112, view, 0);
            return;
        }
        if (item.f526316f == wd0.w1.f526306f) {
            ((s24.e) iVar3).f483892g = intent;
            try {
                ((s24.e) iVar3).r7(activityC0065xcd7aa112, view, 0);
            } finally {
            }
        } else {
            if (!(iVar instanceof s24.g)) {
                iVar.r7(activityC0065xcd7aa112, view, 0);
                return;
            }
            ((s24.e) iVar3).f483892g = intent;
            try {
                ((s24.e) iVar3).r7(activityC0065xcd7aa112, view, 0);
            } finally {
            }
        }
    }

    public jz5.l Vi(wd0.x1 item, java.lang.String query) {
        java.lang.CharSequence charSequence;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        java.lang.CharSequence Ri = Ri(item.f526311a, query);
        int ordinal = item.f526316f.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                charSequence = "";
                java.lang.String str = item.f526312b;
                if (str == null) {
                    str = "";
                }
                if (!(str.length() == 0)) {
                    charSequence = Ri(str, query);
                }
                return new jz5.l(Ri, charSequence);
            }
            if (ordinal != 2) {
                throw new jz5.j();
            }
        }
        charSequence = item.f526317g;
        return new jz5.l(Ri, charSequence);
    }

    public final void Zi() {
        java.util.Iterator it = this.f516994e.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            java.util.Map.Entry entry = (java.util.Map.Entry) next;
            if (((vd0.y2) entry.getValue()).f517074a.get() == null) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f516995f, entry.getKey())) {
                    this.f516995f = null;
                }
                it.remove();
            }
        }
    }

    public final wd0.w1 aj(vd0.z2 z2Var, java.lang.String str) {
        boolean z17 = false;
        boolean D = r26.n0.D(z2Var.f517087j, str, false, 2, null);
        boolean z18 = z2Var.f517082e && r26.n0.D(z2Var.f517089l, str, false, 2, null);
        boolean D2 = r26.n0.D(z2Var.f517091n, str, false, 2, null);
        if ((D || z18) && !z2Var.f517083f && z2Var.f517081d) {
            z17 = true;
        }
        if (z17) {
            return D ? wd0.w1.f526304d : wd0.w1.f526305e;
        }
        if (D2) {
            return wd0.w1.f526306f;
        }
        return null;
    }

    public final wd0.x1 bj(vd0.z2 z2Var, wd0.w1 w1Var, boolean z17) {
        java.lang.String str;
        if (w1Var == wd0.w1.f526306f) {
            str = z2Var.f517090m;
            if (str.length() == 0) {
                str = z2Var.f517086i;
            }
        } else {
            str = z2Var.f517086i;
        }
        java.lang.String str2 = str;
        java.lang.String str3 = null;
        if (w1Var == wd0.w1.f526305e) {
            java.lang.String str4 = z2Var.f517088k;
            if (!(str4.length() == 0)) {
                str3 = str4;
            }
        }
        return new wd0.x1(str2, str3, z2Var.f517080c, z2Var.f517078a, z2Var.f517079b, w1Var, z2Var.f517092o, z17);
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
        synchronized (this.f516993d) {
            this.f516994e.clear();
            this.f516995f = null;
        }
    }
}
