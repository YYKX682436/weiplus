package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class lb extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f64309d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f64310e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeRoomManagerUI f64311f;

    public lb(com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI, android.content.Context context) {
        this.f64311f = seeRoomManagerUI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f64309d = arrayList;
        this.f64310e = context;
        arrayList.clear();
        com.tencent.mm.storage.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        java.lang.String str = seeRoomManagerUI.f63931f;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.storage.a3 z07 = a17.z0(str == null ? "" : str);
        seeRoomManagerUI.f63930e = z07;
        if (z07 != null) {
            for (java.lang.String str2 : z07.A0()) {
                if (seeRoomManagerUI.f63930e.G0(str2)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SeeRoomManagerUI", "[resetData] Room Manager:%s", str2);
                    arrayList.add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 1, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true)));
                }
            }
            if (c01.z1.r().equals(seeRoomManagerUI.f63930e.field_roomowner)) {
                arrayList.add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 2, null));
                if (arrayList.size() > 1) {
                    arrayList.add(new com.tencent.mm.chatroom.ui.ib(seeRoomManagerUI, 3, null));
                }
            }
        }
        notifyDataSetChanged();
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f64309d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (com.tencent.mm.chatroom.ui.ib) ((java.util.ArrayList) this.f64309d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.chatroom.ui.mb mbVar;
        android.text.SpannableString spannableString;
        java.lang.String z07;
        com.tencent.mm.chatroom.ui.SeeRoomManagerUI seeRoomManagerUI = this.f64311f;
        android.content.Context context = this.f64310e;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.chc, null);
            seeRoomManagerUI.getClass();
            mbVar = new com.tencent.mm.chatroom.ui.mb(seeRoomManagerUI);
            mbVar.f64374a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m7e);
            mbVar.f64375b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7b);
        } else {
            mbVar = (com.tencent.mm.chatroom.ui.mb) view.getTag();
            if (mbVar == null) {
                seeRoomManagerUI.getClass();
                mbVar = new com.tencent.mm.chatroom.ui.mb(seeRoomManagerUI);
                mbVar.f64374a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.m7e);
                mbVar.f64375b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.m7b);
            }
        }
        com.tencent.mm.chatroom.ui.ib ibVar = (com.tencent.mm.chatroom.ui.ib) ((java.util.ArrayList) this.f64309d).get(i17);
        if (ibVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SeeRoomManagerUI", "null == item! position:%s, count:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view;
        }
        int i18 = ibVar.f64234a;
        if (i18 == 1) {
            mbVar.f64375b.setVisibility(0);
            android.widget.TextView textView = mbVar.f64375b;
            com.tencent.mm.storage.z3 z3Var = ibVar.f64235b;
            java.lang.String d17 = z3Var.d1();
            android.widget.TextView textView2 = mbVar.f64375b;
            int i19 = com.tencent.mm.chatroom.ui.SeeRoomManagerUI.f63928i;
            seeRoomManagerUI.getClass();
            if (textView2 != null) {
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mm.storage.z3 n17 = Bi.n(d17 == null ? "" : d17, true);
                if (n17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SeeRoomManagerUI", "ct == null");
                } else {
                    if (com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
                        com.tencent.mm.storage.a3 a3Var = seeRoomManagerUI.f63930e;
                        z07 = a3Var != null ? a3Var.z0(d17) : null;
                    } else {
                        z07 = n17.w0();
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
                        z07 = n17.w0();
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(z07)) {
                        z07 = n17.f2();
                    }
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str = z07 != null ? z07 : "";
                    float textSize = textView2.getTextSize();
                    ((ke0.e) xVar).getClass();
                    spannableString = com.tencent.mm.pluginsdk.ui.span.c0.j(seeRoomManagerUI, str, textSize);
                    textView.setText(spannableString);
                    ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(mbVar.f64374a, z3Var.d1(), null);
                }
            }
            spannableString = null;
            textView.setText(spannableString);
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(mbVar.f64374a, z3Var.d1(), null);
        } else if (i18 == 2) {
            mbVar.f64375b.setVisibility(4);
            mbVar.f64374a.setImageResource(com.tencent.mm.R.drawable.f480953g8);
            mbVar.f64374a.setContentDescription(context.getString(com.tencent.mm.R.string.f489837d5));
        } else if (i18 == 3) {
            mbVar.f64375b.setVisibility(4);
            mbVar.f64374a.setImageResource(com.tencent.mm.R.drawable.f480954g9);
            mbVar.f64374a.setContentDescription(context.getString(com.tencent.mm.R.string.bo7));
        }
        view.setOnClickListener(new com.tencent.mm.chatroom.ui.kb(this, i17));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f64311f.f63929d.post(new com.tencent.mm.chatroom.ui.jb(this));
    }
}
