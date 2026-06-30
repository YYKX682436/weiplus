package fk2;

/* loaded from: classes3.dex */
public class i2 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.regex.Pattern f344940m = java.util.regex.Pattern.compile("<_wc_custom_link_.+?(.*?)>(.*?)</_wc_custom_link_>");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // we2.o
    public yz5.l c(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new fk2.h2(msg, this);
    }

    @Override // we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        super.d(context, holder, msg, i17);
        java.lang.Object D = msg.D();
        r45.ph1 ph1Var = D instanceof r45.ph1 ? (r45.ph1) D : null;
        if (ph1Var != null) {
            java.lang.String m75945x2fec8307 = ph1Var.m75945x2fec8307(6);
            java.lang.String m75945x2fec83072 = ph1Var.m75945x2fec8307(7);
            if (m75945x2fec8307 != null && m75945x2fec83072 != null) {
                java.lang.String str = "<_wc_custom_link_ color=\"#80FFFFFF\" backgroundenabled=\"0\">" + m75945x2fec8307 + "</_wc_custom_link_>" + m75945x2fec83072;
                i95.m c17 = i95.n0.c(zy2.s6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c17;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
                java.lang.CharSequence l66 = zy2.s6.l6(s6Var, str, (int) c22624x85d69039.m84164x40077844(), false, f344940m, 0, false, null, 116, null);
                if (!ph1Var.m75933x41a8a7f2(3)) {
                    l66 = android.text.TextUtils.concat(l66, " ", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lkv));
                }
                c22624x85d69039.b(l66);
            }
            if (ph1Var.m75933x41a8a7f2(3)) {
                android.view.View view = holder.f103463h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = holder.f103463h;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemProduct", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (zl2.r4.f555483a.w1()) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.t2[] t2VarArr = ml2.t2.f409547d;
                jSONObject.put("type", 33);
                jSONObject.put("commentid", msg.f());
                java.lang.String m75945x2fec83073 = ph1Var.m75945x2fec8307(0);
                jSONObject.put("productid", m75945x2fec83073 != null ? m75945x2fec83073 : "");
                jSONObject.put("comment_type", ph1Var.m75939xb282bd08(5));
                i95.m c18 = i95.n0.c(ml2.j0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                zy2.zb.y6((zy2.zb) c18, ml2.z4.f409899o, jSONObject.toString(), null, 4, null);
                return;
            }
            i95.m c19 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c19;
            ml2.f4 f4Var = ml2.f4.R;
            java.lang.String m75945x2fec83074 = ph1Var.m75945x2fec8307(0);
            java.lang.String str2 = m75945x2fec83074 == null ? "" : m75945x2fec83074;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("commentid", msg.f());
            jSONObject2.put("comment_type", ph1Var.m75939xb282bd08(5));
            ml2.r0.Dj(r0Var, f4Var, null, str2, null, null, null, 0, 0L, jSONObject2, null, null, null, false, null, 16120, null);
        }
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.ub(msg);
    }

    @Override // we2.o
    public int n() {
        return 20113;
    }
}
