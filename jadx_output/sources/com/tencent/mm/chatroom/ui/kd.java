package com.tencent.mm.chatroom.ui;

/* loaded from: classes12.dex */
public class kd extends android.widget.BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64285e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f64286f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f64287g;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SelectMemberUI f64292o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f64284d = new java.lang.String(java.lang.Character.toChars(91));

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f64288h = new java.util.ArrayList(0);

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f64289i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public volatile boolean f64290m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f64291n = new java.util.HashMap();

    public kd(com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI, android.content.Context context, com.tencent.mm.storage.a3 a3Var, java.lang.String str, java.lang.String str2) {
        this.f64292o = selectMemberUI;
        this.f64287g = null;
        this.f64285e = a3Var;
        this.f64287g = str2;
        this.f64286f = context;
    }

    public final java.lang.String a(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String z07;
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            java.lang.String d17 = z3Var.d1();
            this.f64292o.getClass();
            com.tencent.mm.storage.a3 a3Var = this.f64285e;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = z3Var.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = z3Var.f2();
        }
        if (z3Var.r2()) {
            return z07;
        }
        com.tencent.mm.storage.ya z08 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
        return (z08 == null || com.tencent.mm.sdk.platformtools.t8.K0(z08.field_conRemark)) ? z07 : z08.field_conRemark;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.chatroom.ui.bd getItem(int i17) {
        if (this.f64289i.size() > i17) {
            return (com.tencent.mm.chatroom.ui.bd) this.f64289i.get(i17);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        if (this.f64289i == null || this.f64290m) {
            return 0;
        }
        return this.f64289i.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.chatroom.ui.ld ldVar;
        android.view.View view2;
        android.content.Context context = this.f64286f;
        com.tencent.mm.chatroom.ui.SelectMemberUI selectMemberUI = this.f64292o;
        if (view == null) {
            view2 = android.view.View.inflate(context, com.tencent.mm.R.layout.cjw, null);
            ldVar = new com.tencent.mm.chatroom.ui.ld();
            ldVar.f64319g = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.f485378hh0);
            ldVar.f64314b = (com.tencent.mm.ui.base.MaskLayout) view2.findViewById(com.tencent.mm.R.id.mjo);
            ldVar.f64315c = (com.tencent.mm.ui.base.EllipsizeTextView) view2.findViewById(com.tencent.mm.R.id.mjq);
            ldVar.f64315c = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mjq);
            ldVar.f64317e = (android.widget.ImageButton) view2.findViewById(com.tencent.mm.R.id.f483504b16);
            ldVar.f64318f = (android.widget.LinearLayout) view2.findViewById(com.tencent.mm.R.id.b17);
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            ldVar.f64315c.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.mjp);
            ldVar.f64316d = textView;
            textView.setMaxWidth((windowManager.getDefaultDisplay().getWidth() * 2) / 3);
            ldVar.f64320h = (com.tencent.mm.ui.widget.imageview.WeImageView) view2.findViewById(com.tencent.mm.R.id.smq);
            view2.setTag(ldVar);
            com.tencent.mm.chatroom.ui.bd item = getItem(i17);
            if (item != null) {
                if (selectMemberUI.f63981q.contains(item.f64059a.d1())) {
                    ldVar.f64317e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                    ldVar.f64319g.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.FALSE);
                } else {
                    ldVar.f64317e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                    ldVar.f64319g.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.TRUE);
                }
            }
            selectMemberUI.getClass();
            if (selectMemberUI instanceof com.tencent.mm.chatroom.ui.SelectDelMemberUI) {
                ldVar.f64320h.setVisibility(0);
                ldVar.f64320h.setClickable(true);
            } else {
                ldVar.f64320h.setVisibility(8);
                ldVar.f64320h.setClickable(false);
            }
            ldVar.f64317e.setOnClickListener(new com.tencent.mm.chatroom.ui.fd(this, ldVar));
            ldVar.f64318f.setOnClickListener(new com.tencent.mm.chatroom.ui.gd(this, view2, ldVar));
            ldVar.f64320h.setOnClickListener(new com.tencent.mm.chatroom.ui.hd(this));
            view2.setOnClickListener(new com.tencent.mm.chatroom.ui.id(this));
        } else {
            ldVar = (com.tencent.mm.chatroom.ui.ld) view.getTag();
            view2 = view;
        }
        com.tencent.mm.chatroom.ui.bd item2 = getItem(i17);
        ldVar.f64318f.setTag(java.lang.Integer.valueOf(i17));
        ldVar.f64320h.setTag(java.lang.Integer.valueOf(i17));
        if (item2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectMemberAdapter", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view2;
        }
        com.tencent.mm.storage.z3 z3Var = item2.f64059a;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai((android.widget.ImageView) ldVar.f64314b.getContentView(), z3Var.d1(), null);
        if (z3Var.f1() == 0) {
            ldVar.f64314b.setMaskDrawable(null);
        } else if (c01.n8.b() != null) {
            java.lang.String b17 = ((xf4.d) c01.n8.b()).b(z3Var.f1(), false);
            if (b17 != null) {
                ((qv.y) ((rv.b3) i95.n0.c(rv.b3.class))).getClass();
                ldVar.f64314b.b(r01.y1.a(b17, 1.5f), db5.r8.SUBSCRIPT_DRAWABLE_DIRECTION_BOTTOM_RIGHT);
            } else {
                ldVar.f64314b.setMaskDrawable(null);
            }
        } else {
            ldVar.f64314b.setMaskDrawable(null);
        }
        java.lang.String a17 = a(z3Var);
        view2.setTag(com.tencent.mm.R.id.vcb, a17);
        java.lang.String str = z3Var.r2() ? z3Var.f236589y1 : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ldVar.f64316d.setVisibility(8);
            ldVar.f64316d.setText("");
        } else {
            ldVar.f64316d.setVisibility(0);
            android.widget.TextView textView2 = ldVar.f64316d;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = ldVar.f64316d.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        }
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).ij(this.f64286f, ldVar.f64315c, a17, z3Var.Q0(), z3Var.G0(), (int) ldVar.f64315c.getTextSize());
        } else {
            android.widget.TextView textView3 = ldVar.f64315c;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            float textSize2 = ldVar.f64315c.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, a17, textSize2));
        }
        if (selectMemberUI.X6()) {
            ldVar.f64317e.setVisibility(0);
            ldVar.f64318f.setVisibility(0);
            if (selectMemberUI.V6().contains(z3Var.d1())) {
                ldVar.f64318f.setEnabled(false);
                ldVar.f64317e.setEnabled(false);
                ldVar.f64317e.setImageResource(com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.raw.checkbox_selected_grey_dark : com.tencent.mm.R.raw.checkbox_selected_grey);
            } else {
                ldVar.f64318f.setEnabled(true);
                ldVar.f64317e.setEnabled(true);
                if (selectMemberUI.f63981q.contains(item2.f64059a.d1())) {
                    ldVar.f64317e.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                    ldVar.f64319g.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.TRUE);
                } else {
                    ldVar.f64317e.setImageResource(com.tencent.mm.R.drawable.f481256oo);
                    ldVar.f64319g.setTag(com.tencent.mm.R.id.cec, java.lang.Boolean.FALSE);
                }
            }
        } else {
            ldVar.f64317e.setVisibility(8);
            ldVar.f64318f.setVisibility(8);
        }
        ldVar.f64313a = item2;
        ldVar.f64321i = i17;
        return view2;
    }
}
