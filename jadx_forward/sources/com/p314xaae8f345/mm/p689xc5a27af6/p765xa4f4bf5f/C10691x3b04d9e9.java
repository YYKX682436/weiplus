package com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f;

@j95.b
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/feature/textstatus/StatusThirdShareFeatureService;", "Li95/w;", "Lxe0/g0;", "<init>", "()V", "Companion", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService */
/* loaded from: classes11.dex */
public final class C10691x3b04d9e9 extends i95.w implements xe0.g0 {

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/feature/textstatus/StatusThirdShareFeatureService$Companion;", "", "()V", "TAG", "", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService$Companion */
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }
    }

    static {
        new com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9.Companion(null);
    }

    public final void Ai(bi4.d1 d1Var) {
        if (d1Var.f436475i == 0) {
            d1Var.f436475i = 5L;
        }
        pj4.b0 b0Var = d1Var.f436470d;
        pj4.o0 o0Var = b0Var != null ? b0Var.f436508g : null;
        if (o0Var != null) {
            java.lang.String d17 = wi4.a.d(o0Var);
            if (d17 == null || r26.n0.N(d17)) {
                return;
            }
            if (o0Var.f436749g == null) {
                o0Var.f436749g = new java.util.LinkedList();
            }
            if (o0Var.f436749g.size() == 0) {
                java.util.LinkedList jumps = o0Var.f436754o.f436542m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumps, "jumps");
                if (!jumps.isEmpty()) {
                    o0Var.f436749g.addAll(o0Var.f436754o.f436542m);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusThirdShare", "preprocess jumpinfos size err null,protect");
                java.util.LinkedList linkedList = new java.util.LinkedList();
                o0Var.f436749g = linkedList;
                pj4.j0 j0Var = new pj4.j0();
                j0Var.f436672d = "0";
                linkedList.add(j0Var);
            }
        }
    }

    public final void Bi(bi4.d1 d1Var) {
        pj4.b0 b0Var;
        pj4.b0 b0Var2;
        pj4.o0 o0Var;
        pj4.b0 b0Var3;
        pj4.o0 o0Var2;
        pj4.b0 b0Var4;
        pj4.o0 o0Var3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[enterParam] sid:");
        sb6.append((d1Var == null || (b0Var4 = d1Var.f436470d) == null || (o0Var3 = b0Var4.f436508g) == null) ? null : wi4.a.d(o0Var3));
        sb6.append(" vinfo:");
        sb6.append((d1Var == null || (b0Var3 = d1Var.f436470d) == null || (o0Var2 = b0Var3.f436508g) == null) ? null : o0Var2.f436750h);
        sb6.append(" iconId:");
        sb6.append((d1Var == null || (b0Var2 = d1Var.f436470d) == null || (o0Var = b0Var2.f436508g) == null) ? null : o0Var.f436747e);
        sb6.append(" mType:");
        sb6.append((d1Var == null || (b0Var = d1Var.f436470d) == null) ? null : java.lang.Integer.valueOf(b0Var.f436507f));
        sb6.append(" mPath:");
        sb6.append(d1Var != null ? d1Var.f436471e : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.StatusThirdShare", sb6.toString());
    }

    public boolean Di(android.content.Context context, bi4.d1 d1Var) {
        return Ri(context, d1Var, null);
    }

    public boolean Ni(android.app.Activity activity, int i17, bi4.d1 d1Var) {
        if (activity == null) {
            return false;
        }
        Bi(d1Var);
        if (d1Var != null) {
            Ai(d1Var);
        }
        bi4.o1.f102608a.b(activity, d1Var, i17);
        return true;
    }

    public final boolean Ri(android.content.Context context, bi4.d1 d1Var, android.os.ResultReceiver resultReceiver) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TextStatus.StatusThirdShare", "setTextStatus context == null");
            return false;
        }
        Bi(d1Var);
        if (d1Var != null) {
            Ai(d1Var);
        }
        return bi4.o1.f102608a.a(context, d1Var, resultReceiver);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bi4.t0 Ui(android.content.Context r7, bi4.n1 r8, bi4.l1 r9) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9.Ui(android.content.Context, bi4.n1, bi4.l1):bi4.t0");
    }

    public void Vi(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusMusicFloatBallUtil", "setTingFloatBallState show: " + z17);
        bk4.d1.f102987c = z17;
    }

    public void wi(android.app.Activity activity, android.content.Intent intent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        intent.setClass(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18664x6b60ccde.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/feature/textstatus/StatusThirdShareFeatureService", "goTextStatusPreviewFinderUIForResult", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
