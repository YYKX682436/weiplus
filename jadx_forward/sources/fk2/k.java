package fk2;

/* loaded from: classes3.dex */
public class k extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final fk2.h f344946m = new fk2.h(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String sb6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        android.view.View view = holder.f3639x46306858;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemAnnoucement", "onBindWelcomeMsg", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c22624x85d69039, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405 c14315xbe4ed405 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14315xbe4ed405) c22624x85d69039;
        if (msg.x().length() > 0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4h));
            sb7.append(' ');
            java.lang.String j17 = msg.j();
            sb7.append(r26.n0.u0(j17 != null ? j17 : "").toString());
            sb7.append('\n');
            sb7.append(r26.n0.u0(msg.x()).toString());
            sb6 = sb7.toString();
        } else {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4h));
            sb8.append(' ');
            java.lang.String j18 = msg.j();
            sb8.append(j18 != null ? j18 : "");
            sb6 = sb8.toString();
        }
        java.lang.String str = sb6;
        fk2.h hVar = f344946m;
        we2.a aVar = this.f526773a;
        hVar.a(str, c14315xbe4ed405, aVar.f(), this.f526780h, aVar.h(i17), holder);
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a1k));
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e68, hVar.b());
        c14315xbe4ed405.m57316x64c31e10(new fk2.i(this, i17, str));
        c14315xbe4ed405.m57314x84fb3157(new fk2.j(this, i17));
        if (c14315xbe4ed405.isFolding) {
            java.util.Set m17 = aVar.m();
            if ((m17 == null || m17.contains(java.lang.Integer.valueOf(i17))) ? false : true) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.g4[] g4VarArr = ml2.g4.f409012d;
                ml2.h4[] h4VarArr = ml2.h4.f409056d;
                jSONObject.put("type", 2);
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                jSONObject.put("doc", fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                r0Var.getClass();
                ml2.r0.hj(r0Var, ml2.b4.R, jSONObject2, 0L, null, null, null, null, null, 252, null);
                java.util.Set m18 = aVar.m();
                if (m18 != null) {
                    m18.add(java.lang.Integer.valueOf(i17));
                }
            }
        }
    }

    @Override // we2.o
    public dk2.zf f(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.mf(msg);
    }

    @Override // we2.o
    public int n() {
        return 100000;
    }
}
