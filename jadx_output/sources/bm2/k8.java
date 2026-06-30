package bm2;

/* loaded from: classes10.dex */
public final class k8 extends androidx.recyclerview.widget.f2 implements bm2.x8 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f22046d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f22047e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f22048f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f22049g;

    /* renamed from: h, reason: collision with root package name */
    public final int f22050h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f22051i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.l f22052m;

    /* renamed from: n, reason: collision with root package name */
    public int f22053n;

    public k8(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f22046d = liveData;
        this.f22047e = "finder_live_sing_song_play.pag";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f22048f = linkedList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f22049g = true;
        this.f22050h = 8;
        zl2.q4.f473933a.R("FinderLiveAnchorSingSongListAdapter");
        linkedList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f329241f.b());
    }

    @Override // bm2.x8
    public void b(boolean z17) {
        yz5.l lVar;
        java.util.LinkedList linkedList = this.f22048f;
        linkedList.clear();
        gk2.e eVar = this.f22046d;
        linkedList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f329241f.b());
        mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.getValue();
        java.lang.String str = j7Var != null ? j7Var.f329183a : null;
        if (!(str == null || str.length() == 0)) {
            int i17 = 0;
            for (java.lang.Object obj : linkedList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (kotlin.jvm.internal.o.b(((dk2.yg) obj).f234393a, str) && (lVar = this.f22052m) != null) {
                    lVar.invoke(java.lang.Integer.valueOf(i17));
                }
                i17 = i18;
            }
            ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.postValue(null);
        }
        dk2.yg ygVar = (dk2.yg) kz5.n0.Z(linkedList);
        if (ygVar != null && ygVar.f234395c == 4) {
            ((dk2.yg) linkedList.getFirst()).getClass();
            this.f22053n = 1;
        } else {
            this.f22053n = 0;
        }
        if (z17) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22048f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((dk2.yg) this.f22048f.get(i17)).f234395c;
    }

    @Override // bm2.x8
    public void m() {
        this.f22048f.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.i8 holder = (bm2.i8) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.LinkedList linkedList = this.f22048f;
        java.lang.Object obj = linkedList.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = ygVar.f234393a;
        android.widget.TextView textView = holder.f21986f;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        long j17 = ygVar.f234394b;
        android.widget.TextView textView2 = holder.f21988h;
        if (j17 > 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String valueOf = java.lang.String.valueOf(ygVar.f234394b);
            float textSize2 = textView2.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, valueOf, textSize2));
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) dk2.ef.f233411z.get("15_white");
        if (bitmap != null) {
            holder.f21989i.setImageBitmap(bitmap);
        }
        le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str2 = ygVar.f234400h;
        android.widget.TextView textView3 = holder.f21987g;
        float textSize3 = textView3.getTextSize();
        ((ke0.e) xVar3).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, str2, textSize3));
        com.tencent.mm.view.MMPAGView mMPAGView = holder.f21984d;
        kotlin.jvm.internal.o.f(mMPAGView, "<get-singSongIcon>(...)");
        int i18 = ygVar.f234395c;
        boolean z17 = this.f22049g;
        if (i18 != 4) {
            if (z17) {
                mMPAGView.n();
            }
            mMPAGView.setVisibility(8);
        } else if (z17) {
            mMPAGView.setVisibility(0);
            if (!mMPAGView.f()) {
                mMPAGView.g();
            }
        } else {
            mMPAGView.setVisibility(8);
        }
        int i19 = ygVar.f234395c;
        android.widget.TextView textView4 = holder.f21985e;
        if (i19 != 2) {
            textView4.setText(java.lang.String.valueOf((i17 + 1) - this.f22053n));
        }
        if (ygVar.f234395c == 4) {
            mMPAGView.setVisibility(0);
            textView4.setVisibility(8);
            textView.setTextColor(holder.itemView.getResources().getColor(com.tencent.mm.R.color.f478502m));
            textView3.setTextColor(holder.itemView.getResources().getColor(com.tencent.mm.R.color.Brand_Alpha_0_5));
        } else {
            mMPAGView.setVisibility(8);
            textView4.setVisibility(0);
            textView.setTextColor(holder.itemView.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            textView3.setTextColor(holder.itemView.getResources().getColor(com.tencent.mm.R.color.f479222ta));
        }
        java.lang.CharSequence text = textView3.getText();
        if (text == null || text.length() == 0) {
            textView3.setVisibility(8);
        } else {
            textView3.setVisibility(0);
        }
        holder.itemView.setOnClickListener(new bm2.j8(this, ygVar));
        int i27 = this.f22050h;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = holder.f21990m;
        if (i17 < i27 || i17 != linkedList.size() - 1) {
            constraintLayout.setVisibility(8);
        } else {
            constraintLayout.setVisibility(0);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.tencent.mm.R.layout.b1h, null);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.i8(this, inflate);
    }
}
