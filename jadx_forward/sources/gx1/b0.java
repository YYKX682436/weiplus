package gx1;

/* loaded from: classes12.dex */
public class b0 extends gx1.l {
    public final android.widget.LinearLayout A;
    public final android.widget.LinearLayout B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 C;
    public final android.widget.ImageView D;
    public final android.widget.TextView E;
    public final android.widget.TextView F;
    public ix1.n G;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 H;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f358826z;

    public b0(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.H = new gx1.a0(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567698kf3);
        this.f358826z = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567700kf5);
        this.A = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567699kf4);
        this.B = linearLayout3;
        this.D = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kf6);
        this.E = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf8);
        this.F = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf9);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7) view.findViewById(com.p314xaae8f345.mm.R.id.kej);
        this.C = c13162x3ab5c6d7;
        c13162x3ab5c6d7.m54605x591869be(rx1.d.b());
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(0);
        this.f358837f.setVisibility(8);
        this.f358840i.setVisibility(8);
        linearLayout.setOnClickListener(new gx1.z(this));
    }

    @Override // gx1.a
    public int i() {
        return 4;
    }

    @Override // gx1.l, gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        boolean b17;
        ix1.n nVar = (ix1.n) aVar;
        this.G = nVar;
        boolean z17 = nVar.f376861q;
        android.widget.LinearLayout linearLayout = this.A;
        android.widget.LinearLayout linearLayout2 = this.B;
        android.widget.LinearLayout linearLayout3 = this.f358826z;
        if (z17) {
            linearLayout3.setBackgroundResource(0);
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = aVar.f376851h;
            ix1.n nVar2 = this.G;
            java.lang.String str = nVar2.f376862r;
            int i19 = nVar2.f376877u;
            int i27 = nVar2.f376878v;
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1343xd1075a44.p1344xc35232d7.C13162x3ab5c6d7 c13162x3ab5c6d7 = this.C;
            c13162x3ab5c6d7.getClass();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c13162x3ab5c6d7.f178189n = str;
            c13162x3ab5c6d7.f178190o = i19;
            c13162x3ab5c6d7.f178188m = i27;
            if (z18) {
                android.view.View view = c13162x3ab5c6d7.f178187i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = c13162x3ab5c6d7.f178187i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (c13162x3ab5c6d7.f178189n.equals(c13162x3ab5c6d7.f178191p.f482479e)) {
                double d17 = 0.0d;
                if (c13162x3ab5c6d7.f178191p.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    rx1.g gVar = c13162x3ab5c6d7.f178192q;
                    com.p314xaae8f345.mm.p944x882e457a.c1 c1Var = c13162x3ab5c6d7.f178191p.f482478d;
                    if (c1Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                    } else {
                        d17 = ((sl.j) c1Var).a();
                    }
                    gVar.d(d17, i27, true);
                } else {
                    com.p314xaae8f345.mm.p944x882e457a.c1 c1Var2 = c13162x3ab5c6d7.f178191p.f482478d;
                    if (c1Var2 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "check is pause, but player is null");
                        b17 = false;
                    } else {
                        b17 = ((sl.j) c1Var2).b();
                    }
                    if (b17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        rx1.g gVar2 = c13162x3ab5c6d7.f178192q;
                        com.p314xaae8f345.mm.p944x882e457a.c1 c1Var3 = c13162x3ab5c6d7.f178191p.f482478d;
                        if (c1Var3 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                        } else {
                            d17 = ((sl.j) c1Var3).a();
                        }
                        gVar2.d(d17, i27, false);
                    } else {
                        c13162x3ab5c6d7.f178192q.b(i27);
                    }
                }
            } else {
                c13162x3ab5c6d7.f178192q.b(i27);
            }
        } else {
            linearLayout3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.s_);
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.D;
            if (imageView.getAnimation() != null) {
                imageView.startAnimation(imageView.getAnimation());
            } else {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500L);
                alphaAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
            }
            boolean booleanValue = this.G.f376882w.booleanValue();
            android.widget.TextView textView = this.F;
            android.widget.TextView textView2 = this.E;
            if (booleanValue) {
                this.H.mo50305x3d8a09a2(4096);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ce6);
                textView.setText(" " + ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.G.f376876t)).toString());
            } else {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572757ce5);
                textView.setText(" " + ((java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.u1.j(this.G.f376878v))).toString());
            }
        }
        super.j(aVar, i17, i18);
    }
}
