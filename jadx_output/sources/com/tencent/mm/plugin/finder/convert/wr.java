package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public class wr extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final r45.qt2 f104898e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f104899f;

    public wr(r45.qt2 qt2Var, int i17, java.util.List list) {
        this.f104898e = qt2Var;
        this.f104899f = list;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.b4m;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.j item = (so2.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.kiz);
        if (linearLayout.getTag() == null) {
            linearLayout.setTag(java.lang.Integer.valueOf(i17));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        com.tencent.mm.protobuf.g gVar;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.h0 h0Var;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
        h0Var3.f310123d = "";
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        boolean z17 = true;
        f0Var.f310116d = 1;
        java.util.List list = this.f104899f;
        if (list == null || list.isEmpty()) {
            gVar = null;
            linkedList = null;
        } else {
            r45.ww2 ww2Var = (r45.ww2) list.get(0);
            java.lang.String string = ww2Var.getString(1);
            h0Var3.f310123d = string != null ? string : "";
            h0Var2.f310123d = ww2Var.getList(4);
            java.util.LinkedList list2 = ww2Var.getList(5);
            com.tencent.mm.protobuf.g byteString = ww2Var.getByteString(6);
            java.util.List list3 = (java.util.List) h0Var2.f310123d;
            if ((list3 == null || list3.isEmpty()) ? false : true) {
                f0Var.f310116d = 3;
            }
            linkedList = list2;
            gVar = byteString;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var3.f310123d;
        if (charSequence == null || charSequence.length() == 0) {
            java.lang.String string2 = recyclerView.getContext().getString(com.tencent.mm.R.string.cuy);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            h0Var3.f310123d = string2;
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.kiz);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.f486190kj1);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText((java.lang.CharSequence) h0Var3.f310123d);
        java.lang.Object tag = linearLayout.getTag();
        java.lang.String str = (java.lang.String) h0Var3.f310123d;
        java.util.List list4 = (java.util.List) h0Var2.f310123d;
        if (list4 != null && !list4.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) holder.itemView.findViewById(com.tencent.mm.R.id.kiy)).setVisibility(0);
        }
        if (list4 == null || linkedList == null) {
            h0Var = h0Var3;
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = (androidx.recyclerview.widget.RecyclerView) holder.itemView.findViewById(com.tencent.mm.R.id.f486189kj0);
            recyclerView2.setVisibility(0);
            recyclerView2.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext(), 0, false));
            int dimensionPixelSize = recyclerView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
            int dimensionPixelSize2 = recyclerView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
            android.content.Context context = recyclerView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            h0Var = h0Var3;
            com.tencent.mm.plugin.finder.convert.qr qrVar = new com.tencent.mm.plugin.finder.convert.qr(this, context, dimensionPixelSize, dimensionPixelSize2, tag, str, gVar);
            recyclerView2.setAdapter(qrVar);
            recyclerView2.N(new com.tencent.mm.plugin.finder.convert.rr(this, dimensionPixelSize, dimensionPixelSize2));
            java.util.ArrayList arrayList = (java.util.ArrayList) qrVar.f104421h;
            arrayList.clear();
            arrayList.addAll(list4);
            java.util.ArrayList arrayList2 = (java.util.ArrayList) qrVar.f104422i;
            arrayList2.clear();
            arrayList2.addAll(linkedList);
            qrVar.notifyDataSetChanged();
        }
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        kotlin.jvm.internal.h0 h0Var4 = h0Var;
        ym5.a1.h(itemView, new com.tencent.mm.plugin.finder.convert.ur(this, linearLayout, h0Var2, f0Var, h0Var4));
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.convert.vr(this, f0Var, recyclerView, linearLayout, h0Var4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final void n(int i17, int i18, android.content.Context context, java.lang.Object obj, java.lang.String wording, java.lang.String feedIds) {
        int bl6;
        java.lang.String str;
        java.lang.String str2;
        int i19;
        ?? r37;
        int i27;
        java.lang.String string;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(feedIds, "feedIds");
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        r45.qt2 qt2Var = this.f104898e;
        java.lang.String str3 = null;
        ((m30.m) rVar).Bi(qt2Var != null ? qt2Var.getString(1) : null);
        long j17 = c01.z1.j();
        if ((34359738368L & j17) != 0) {
            long j18 = j17 & (-34359738369L);
            gm0.j1.u().c().w(147457, java.lang.Long.valueOf(j18));
            com.tencent.mars.xlog.Log.i("Finder.FinderOpenEntranceTipConvert", "openFinderEntrance extstatus:" + j18);
            r45.p53 p53Var = new r45.p53();
            p53Var.f382761d = 57;
            p53Var.f382762e = 1;
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
        }
        int intValue = (obj == null || !(obj instanceof java.lang.Integer)) ? -1 : ((java.lang.Number) obj).intValue();
        if (i17 == 0) {
            bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(3);
            str = "KEY_FINDER_JUMP_FOLLOW_TAB";
        } else if (i17 != 2) {
            bl6 = 18;
            str = "KEY_FINDER_JUMP_FRIEND_TAB";
        } else {
            bl6 = ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).bl(4);
            str = "KEY_FINDER_JUMP_HOT_TAB";
        }
        java.lang.String str4 = str;
        if (intValue > 0) {
            str2 = str4;
            i19 = 2;
            r37 = 0;
            i27 = 1;
            com.tencent.mm.plugin.finder.report.y3.a(com.tencent.mm.plugin.finder.report.y3.f125472a, this.f104898e, 2, c01.id.c(), intValue, i18, wording, null, feedIds, 64, null);
        } else {
            str2 = str4;
            i19 = 2;
            r37 = 0;
            i27 = 1;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15185, 11, java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i19));
        if (context instanceof android.app.Activity) {
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
            if (g1Var != null) {
                g1Var.f134456e = r37;
            }
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.finder.convert.tr trVar = new com.tencent.mm.plugin.finder.convert.tr(context);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(trVar, 280L, r37);
        }
        android.content.Intent intent = new android.content.Intent();
        int i28 = i27;
        intent.putExtra(str2, (boolean) i28);
        intent.putExtra("KEY_FROM_SHARE_REL", (boolean) i28);
        intent.putExtra("key_auto_trigger_type", 3);
        r45.qt2 qt2Var2 = this.f104898e;
        if (qt2Var2 != null && (string = qt2Var2.getString(i28)) != null) {
            char[] cArr = new char[i28];
            cArr[r37] = '-';
            str3 = (java.lang.String) r26.n0.e0(string, cArr, false, 0, 6, null).get(r37);
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(str3, -1);
        if (P > 0 && bl6 > 0) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(P, 9, bl6, intent);
        }
        com.tencent.mm.plugin.finder.report.v1.f125393a.d();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.ub.L7((c61.ub) c17, context, intent, 1, false, 8, null);
    }
}
