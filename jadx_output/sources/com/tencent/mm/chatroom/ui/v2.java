package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class v2 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f64589d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.DelChatroomMemberUI f64590e;

    public v2(com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI) {
        this.f64590e = delChatroomMemberUI;
    }

    public java.lang.String a(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String z07;
        if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.w0())) {
            java.lang.String d17 = z3Var.d1();
            com.tencent.mm.storage.a3 a3Var = this.f64590e.f63751i;
            z07 = a3Var == null ? null : a3Var.z0(d17);
        } else {
            z07 = z3Var.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
            z07 = z3Var.w0();
        }
        return com.tencent.mm.sdk.platformtools.t8.K0(z07) ? z3Var.f2() : z07;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.LinkedList) this.f64589d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.LinkedList) this.f64589d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.chatroom.ui.w2 w2Var;
        com.tencent.mm.chatroom.ui.DelChatroomMemberUI delChatroomMemberUI = this.f64590e;
        if (view == null) {
            view = android.view.View.inflate(delChatroomMemberUI, com.tencent.mm.R.layout.f488404sd, null);
            w2Var = new com.tencent.mm.chatroom.ui.w2(delChatroomMemberUI);
            w2Var.f64614a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bgm);
            w2Var.f64615b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgn);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bgl);
            w2Var.f64616c = textView;
            textView.setOnClickListener(new com.tencent.mm.chatroom.ui.u2(this));
            view.setTag(w2Var);
        } else {
            w2Var = (com.tencent.mm.chatroom.ui.w2) view.getTag();
        }
        w2Var.f64616c.setTag(java.lang.Integer.valueOf(i17));
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) getItem(i17);
        java.lang.String a17 = a(z3Var);
        w2Var.f64615b.setText(a17);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        float textSize = w2Var.f64615b.getTextSize();
        ((ke0.e) xVar).getClass();
        com.tencent.mm.pluginsdk.ui.span.c0.j(delChatroomMemberUI, a17, textSize);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(w2Var.f64614a, z3Var.d1(), null);
        return view;
    }
}
