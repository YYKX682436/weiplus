package uc5;

/* loaded from: classes9.dex */
public abstract class b0 extends uc5.n {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ad5.l0[] availableOperations) {
        super(availableOperations);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableOperations, "availableOperations");
    }

    public final void A(android.content.Context context, em.a2 binding, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.c().setImageDrawable(null);
        binding.a().setImageResource(i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a17 = binding.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "showDefaultIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "showDefaultIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (binding.f335593i == null) {
            binding.f335593i = (com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39) binding.f335585a.findViewById(com.p314xaae8f345.mm.R.id.h68);
        }
        binding.f335593i.setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b, null));
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        return android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekk, (android.view.ViewGroup) recyclerView, false);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new em.a2(holder.f3639x46306858);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (binding.f335592h == null) {
            binding.f335592h = (android.widget.CheckBox) binding.f335585a.findViewById(com.p314xaae8f345.mm.R.id.bsc);
        }
        android.widget.CheckBox checkBox = binding.f335592h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(checkBox, "getCheckBox(...)");
        return checkBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.view.View view = binding.f335585a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void v(android.content.Context context, in5.s0 holder, uc5.d item, java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.widget.TextView textView = binding.f335586b;
        android.view.View view = binding.f335585a;
        if (textView == null) {
            binding.f335586b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nec);
        }
        android.widget.TextView textView2 = binding.f335586b;
        android.content.res.Resources resources = context.getResources();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String d17 = g95.e0.d(item.p());
        ((sg3.a) v0Var).getClass();
        textView2.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbm, c01.a2.e(d17)));
        if (binding.f335589e == null) {
            binding.f335589e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        }
        binding.f335589e.setText(k35.m1.f(context, item.p().T1(), true, false));
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.a2 binding = (em.a2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.d().setText("");
        binding.b().setText("");
        android.widget.TextView b17 = binding.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        binding.c().setPadding(0, 0, 0, 0);
        binding.c().setImageDrawable(null);
        binding.c().setBackground(null);
        if (binding.f335593i == null) {
            binding.f335593i = (com.p314xaae8f345.mm.p653x55bb7a46.p658xd1075a44.C10395x48f00a39) binding.f335585a.findViewById(com.p314xaae8f345.mm.R.id.h68);
        }
        binding.f335593i.setBackground(null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 a17 = binding.a();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(a17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(a17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        a17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(a17, "com/tencent/mm/ui/chatting/history/base/MsgHistoryGalleryListItemConvert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryListItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(a17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // uc5.n
    /* renamed from: y */
    public void n(android.content.Context context, em.a2 binding, java.lang.String query) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f508060n;
        eVar.a();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null);
        android.widget.TextView d17 = binding.d();
        java.lang.CharSequence text = binding.d().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        d17.setText(eVar.b(text, query, color));
        android.widget.TextView b17 = binding.b();
        java.lang.CharSequence text2 = binding.b().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        b17.setText(eVar.b(text2, query, color));
    }

    public final void z(android.widget.TextView textView, android.content.Context context, java.lang.CharSequence text) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, text));
    }
}
