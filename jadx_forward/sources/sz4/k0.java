package sz4;

/* loaded from: classes12.dex */
public class k0 extends sz4.u {
    public final android.widget.LinearLayout A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 B;
    public final android.widget.ImageView C;
    public final android.widget.TextView D;
    public final android.widget.TextView E;
    public iz4.l F;
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 G;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.LinearLayout f495739y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.LinearLayout f495740z;

    public k0(android.view.View view, mz4.j0 j0Var, mz4.d dVar, uz4.d dVar2) {
        super(view, j0Var, dVar);
        this.G = new sz4.j0(this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567698kf3);
        this.f495739y = linearLayout;
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567700kf5);
        this.f495740z = linearLayout2;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567699kf4);
        this.A = linearLayout3;
        this.C = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kf6);
        this.D = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf8);
        this.E = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kf9);
        com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705) view.findViewById(com.p314xaae8f345.mm.R.id.kej);
        this.B = c19532x15431705;
        c19532x15431705.m74993x591869be(dVar2);
        linearLayout.setVisibility(0);
        linearLayout2.setVisibility(8);
        linearLayout3.setVisibility(0);
        this.f495764f.setVisibility(8);
        this.f495767i.setVisibility(8);
        linearLayout.setOnClickListener(new sz4.i0(this));
    }

    @Override // sz4.a
    public int i() {
        return 4;
    }

    @Override // sz4.u, sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        iz4.l lVar = (iz4.l) cVar;
        this.F = lVar;
        boolean z17 = lVar.f377667r;
        android.widget.LinearLayout linearLayout = this.f495740z;
        android.widget.LinearLayout linearLayout2 = this.A;
        android.widget.LinearLayout linearLayout3 = this.f495739y;
        if (z17) {
            linearLayout3.setBackgroundResource(0);
            linearLayout2.setVisibility(0);
            linearLayout.setVisibility(8);
            linearLayout3.setPadding(0, 0, 0, 0);
            boolean z18 = cVar.f377644i;
            iz4.l lVar2 = this.F;
            java.lang.String str = lVar2.f377668s;
            int i19 = lVar2.f377695w;
            int i27 = lVar2.f377696x;
            com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p2455xc35232d7.C19532x15431705 c19532x15431705 = this.B;
            c19532x15431705.getClass();
            boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            c19532x15431705.f269832n = str;
            c19532x15431705.f269833o = i19;
            c19532x15431705.f269831m = i27;
            if (z18) {
                android.view.View view = c19532x15431705.f269830i;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = c19532x15431705.f269830i;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (c19532x15431705.f269832n.equals(c19532x15431705.f269834p.f513699d)) {
                if (c19532x15431705.f269834p.f()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    uz4.g gVar = c19532x15431705.f269835q;
                    uz4.d dVar = c19532x15431705.f269834p;
                    gVar.d(dVar.f513708p != null ? ((sl.j) dVar.e()).a() : 0.0d, i27, true);
                } else {
                    uz4.d dVar2 = c19532x15431705.f269834p;
                    if (dVar2.f513708p != null && ((sl.j) dVar2.e()).b()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        uz4.g gVar2 = c19532x15431705.f269835q;
                        uz4.d dVar3 = c19532x15431705.f269834p;
                        gVar2.d(dVar3.f513708p != null ? ((sl.j) dVar3.e()).a() : 0.0d, i27, false);
                    } else {
                        c19532x15431705.f269835q.b(i27);
                    }
                }
            } else {
                c19532x15431705.f269835q.b(i27);
            }
        } else {
            linearLayout3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bbs);
            linearLayout3.setPadding(26, 7, 0, 7);
            linearLayout2.setVisibility(8);
            linearLayout.setVisibility(0);
            android.widget.ImageView imageView = this.C;
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
            boolean booleanValue = this.F.f377654y.booleanValue();
            android.widget.TextView textView = this.E;
            android.widget.TextView textView2 = this.D;
            if (booleanValue) {
                this.G.mo50305x3d8a09a2(4096);
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ce6);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.F.f377693u)).toString());
            } else {
                textView2.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572757ce5);
                textView.setText(" " + ((java.lang.String) c31.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, (int) c31.a.a(this.F.f377696x))).toString());
            }
        }
        super.j(cVar, i17, i18);
    }
}
