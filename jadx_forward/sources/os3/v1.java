package os3;

/* loaded from: classes8.dex */
public class v1 implements com.p314xaae8f345.mm.p944x882e457a.u0, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 f429755d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f429756e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f429757f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f429758g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f429759h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f429760i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f429761m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public os3.u1 f429762n = null;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f429763o;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86, android.widget.TextView textView, android.widget.ImageView imageView, android.view.ViewGroup viewGroup) {
        this.f429763o = null;
        this.f429755d = activityC16931x24037f86;
        this.f429756e = viewGroup;
        this.f429763o = null;
        this.f429757f = textView;
        this.f429758g = imageView;
        b();
        gm0.j1.n().f354821b.a(11665, this);
    }

    public void a() {
        java.util.Map map = this.f429759h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            ks3.v0 v0Var = (ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next());
            if (v0Var.f393291g != 2) {
                java.util.Map map2 = this.f429760i;
                ms3.a aVar = (ms3.a) ((java.util.HashMap) map2).get(v0Var.f393288d);
                if (aVar != null) {
                    gm0.j1.n().f354821b.d(aVar);
                    v0Var.f393291g = 3;
                    g(v0Var);
                    ((java.util.HashMap) map2).remove(v0Var.f393288d);
                }
            }
        }
    }

    public void b() {
        java.util.Map map = this.f429759h;
        int size = map.size();
        android.widget.ImageView imageView = this.f429758g;
        android.widget.TextView textView = this.f429757f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429755d;
        android.view.ViewGroup viewGroup = this.f429756e;
        if (size == 0) {
            textView.setText(activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjt) + " " + activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjw));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80913x9888addb);
            android.view.View view = (android.view.View) viewGroup.getParent();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            textView.setText(activityC16931x24037f86.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjt) + activityC16931x24037f86.getResources().getQuantityString(com.p314xaae8f345.mm.R.C30866xe3ab596f.f571223a0, map.size(), java.lang.Integer.valueOf(map.size()), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(d())));
            imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f80914xe6c3d9ae);
            android.view.View view2 = (android.view.View) viewGroup.getParent();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper", "changeSummary", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            if (childCount == 1) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.an8);
            } else if (i17 == 0) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.an9);
            } else if (i17 <= 0 || i17 >= childCount - 1) {
                viewGroup.getChildAt(i17).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ana);
            } else {
                viewGroup.getChildAt(i17).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.an_);
            }
        }
    }

    public final long c(java.lang.String str) {
        try {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(str));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.FileUploadHelper", "doNormalUpload %s", str, r6Var.m82467xfb82e301());
            byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, (int) r6Var.C());
            ms3.a aVar = new ms3.a(str, (int) r6Var.C(), kk.r.a(java.security.MessageDigest.getInstance("SHA1").digest(N)), com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(N));
            gm0.j1.d().g(aVar);
            ((java.util.HashMap) this.f429760i).put(str, aVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Mail.FileUploadHelper", e17, "", new java.lang.Object[0]);
        }
        return java.lang.System.currentTimeMillis();
    }

    public int d() {
        java.util.Map map = this.f429759h;
        java.util.Iterator it = map.keySet().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 = (int) (i17 + ((ks3.v0) map.get((java.lang.String) it.next())).f393290f);
        }
        return i17;
    }

    public java.util.LinkedList e() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Map map = this.f429759h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            linkedList.add((ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next()));
        }
        return linkedList;
    }

    public boolean f() {
        java.util.Map map = this.f429759h;
        java.util.Iterator it = ((java.util.HashMap) map).keySet().iterator();
        while (it.hasNext()) {
            int i17 = ((ks3.v0) ((java.util.HashMap) map).get((java.lang.String) it.next())).f393291g;
            if (i17 != 2 && i17 != 3) {
                return false;
            }
        }
        return true;
    }

    public final void g(ks3.v0 v0Var) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) this.f429756e.findViewById(java.lang.Math.abs(v0Var.f393288d.hashCode() / 2));
        if (linearLayout == null) {
            return;
        }
        os3.t1 t1Var = (os3.t1) linearLayout.getTag();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.FileUploadHelper", "show upload status %d", java.lang.Integer.valueOf(v0Var.f393291g));
        int i17 = v0Var.f393291g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16931x24037f86 activityC16931x24037f86 = this.f429755d;
        if (i17 == 0 || i17 == 1) {
            t1Var.f429737a.setTextColor(activityC16931x24037f86.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            t1Var.f429738b.setVisibility(0);
            t1Var.f429739c.setVisibility(8);
            t1Var.f429740d.setVisibility(8);
            t1Var.f429741e.setVisibility(0);
            return;
        }
        if (i17 == 2) {
            t1Var.f429737a.setTextColor(activityC16931x24037f86.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            t1Var.f429738b.setVisibility(8);
            t1Var.f429739c.setVisibility(8);
            t1Var.f429740d.setVisibility(8);
            t1Var.f429741e.setVisibility(0);
            return;
        }
        if (i17 != 3) {
            return;
        }
        t1Var.f429737a.setTextColor(i65.a.d(activityC16931x24037f86, com.p314xaae8f345.mm.R.C30859x5a72f63.f560839vm));
        t1Var.f429738b.setVisibility(8);
        t1Var.f429739c.setVisibility(0);
        t1Var.f429740d.setVisibility(0);
        t1Var.f429741e.setVisibility(0);
    }

    public void h(java.util.List list) {
        if (list == null) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3.v0 v0Var = (ks3.v0) it.next();
            ((java.util.HashMap) this.f429759h).put(v0Var.f393288d, v0Var);
            i(v0Var);
        }
    }

    public final void i(ks3.v0 v0Var) {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((android.view.ViewGroup) android.view.View.inflate(this.f429755d, com.p314xaae8f345.mm.R.C30864xbddafb2a.cbf, null)).findViewById(com.p314xaae8f345.mm.R.id.kxx);
        android.widget.ImageView imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kxw);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kxy);
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f567867ky0);
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f567868ky1);
        android.widget.TextView textView3 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f567869ky2);
        android.widget.ImageView imageView2 = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kxz);
        android.widget.ImageView imageView3 = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.kxv);
        ((android.view.ViewGroup) linearLayout.getParent()).removeView(linearLayout);
        imageView.setImageResource(o25.y.b(v0Var.f393289e));
        textView.setText(v0Var.f393289e);
        textView2.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(v0Var.f393290f));
        os3.t1 t1Var = new os3.t1(this, null);
        t1Var.f429737a = textView;
        t1Var.f429738b = progressBar;
        t1Var.f429739c = textView3;
        t1Var.f429740d = imageView2;
        t1Var.f429741e = imageView3;
        linearLayout.setTag(t1Var);
        linearLayout.setId(java.lang.Math.abs(v0Var.f393288d.hashCode() / 2));
        android.view.View.OnClickListener onClickListener = this.f429763o;
        if (onClickListener != null) {
            linearLayout.setOnClickListener(onClickListener);
        }
        android.view.ViewGroup viewGroup = this.f429756e;
        viewGroup.addView(linearLayout);
        b();
        linearLayout.setOnClickListener(new os3.n1(this, imageView2));
        imageView2.setOnClickListener(new os3.o1(this, v0Var));
        imageView3.setOnClickListener(new os3.q1(this, v0Var, linearLayout));
        viewGroup.post(new os3.r1(this, v0Var));
        if (v0Var.f393291g == 0) {
            v0Var.f393292h = c(v0Var.f393288d);
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback
    /* renamed from: onC2CUploadCompleted */
    public void mo37921xa24580f5(java.lang.String str, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadResult c2CUploadResult) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.FileUploadHelper", "onC2CUploadCompleted %s", str);
        java.util.Map map = this.f429761m;
        if (((java.util.HashMap) map).containsKey(str)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new os3.s1(this, (ks3.v0) ((java.util.HashMap) this.f429759h).get(((java.util.HashMap) map).get(str)), c2CUploadResult));
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 11665) {
            ms3.a aVar = (ms3.a) m1Var;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
            java.lang.String str2 = aVar.f412509f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.FileUploadHelper", "errType %d, errCode %d, errMsg %s, filePath %s", valueOf, valueOf2, str, str2);
            ks3.v0 v0Var = (ks3.v0) ((java.util.HashMap) this.f429759h).get(str2);
            ((java.util.HashMap) this.f429760i).remove(str2);
            if (v0Var != null) {
                if (i17 != 0 || i18 != 0) {
                    v0Var.f393291g = 3;
                    g(v0Var);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest c2CUploadRequest = new com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CUploadRequest();
                c2CUploadRequest.f17942xcd096f43 = aVar.f412510g;
                c2CUploadRequest.m37892xc707a4f(str2);
                com.p314xaae8f345.mm.p944x882e457a.o oVar = aVar.f412507d;
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                c2CUploadRequest.f17949xd1c72abc = ((ks3.b1) fVar).f393172g;
                c2CUploadRequest.f17950x30f5a8 = ((ks3.b1) fVar).f393171f;
                ((java.util.HashMap) this.f429761m).put(c2CUploadRequest.f17942xcd096f43, str2);
                v0Var.f393291g = 1;
                v0Var.f393293i = ((ks3.b1) oVar.f152244b.f152233a).f393169d;
                g(v0Var);
                ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37785x6284293f(c2CUploadRequest, this);
            }
        }
    }

    @Override // com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.UploadCallback
    /* renamed from: onUploadProgressChanged */
    public void mo37923xdaa196e7(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Mail.FileUploadHelper", "onUploadProgressChanged fileKey:%s finish:%d total:%d", str, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
    }
}
