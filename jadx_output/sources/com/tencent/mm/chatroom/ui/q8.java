package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class q8 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f64456d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64457e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.r8 f64458f;

    public q8(java.util.ArrayList memberList, com.tencent.mm.storage.a3 a3Var, com.tencent.mm.chatroom.ui.r8 r8Var) {
        kotlin.jvm.internal.o.g(memberList, "memberList");
        this.f64456d = memberList;
        this.f64457e = a3Var;
        this.f64458f = r8Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64456d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.CharSequence] */
    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        java.lang.String z07;
        android.text.SpannableString j17;
        com.tencent.mm.chatroom.ui.u8 viewHolder = (com.tencent.mm.chatroom.ui.u8) k3Var;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        java.lang.Object obj = this.f64456d.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) obj;
        android.widget.TextView textView = viewHolder.f64577h;
        textView.setVisibility(0);
        java.lang.String d17 = z3Var.d1();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.storage.z3 n17 = Bi.n(d17 == null ? "" : d17, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoomFollowMemberAdapter", "ct == null");
            j17 = null;
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
                com.tencent.mm.storage.a3 a3Var = viewHolder.f64574e;
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
            ((za0.k) ((ab0.z) i95.n0.c(ab0.z.class))).getClass();
            ?? a17 = t41.c.a(n17, z07);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = a17 != 0 ? a17 : "";
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(viewHolder.f64573d, str, textSize);
        }
        textView.setText(j17);
        kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
        java.lang.String d18 = z3Var.d1();
        android.widget.ImageView imageView = viewHolder.f64576g;
        ((com.tencent.mm.feature.avatar.w) zVar).Ai(imageView, d18, null);
        android.widget.TextView textView2 = viewHolder.f64578i;
        if (textView2 != null) {
            com.tencent.mm.ui.bk.s0(textView2.getPaint());
            textView2.setOnClickListener(new com.tencent.mm.chatroom.ui.s8(viewHolder, z3Var));
        }
        if (imageView != null) {
            imageView.setOnClickListener(new com.tencent.mm.chatroom.ui.t8(viewHolder, z3Var));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: x */
    public com.tencent.mm.chatroom.ui.u8 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488406sf, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.chatroom.ui.u8(context, this.f64457e, inflate, this.f64458f);
    }
}
