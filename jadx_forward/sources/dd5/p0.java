package dd5;

/* loaded from: classes9.dex */
public final class p0 extends uc5.n {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.p0 f310775p = new dd5.p0();

    public p0() {
        super(dd5.s0.f310812b.f508072a);
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ekf, (android.view.ViewGroup) recyclerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // uc5.n
    public void n(android.content.Context context, java.lang.Object obj, java.lang.String query) {
        em.x1 binding = (em.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        android.content.res.Resources resources = context.getResources();
        uc5.e eVar = uc5.n.f508060n;
        eVar.a();
        int color = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m, null);
        android.widget.TextView e17 = binding.e();
        java.lang.CharSequence text = binding.e().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        e17.setText(eVar.b(text, query, color));
        android.widget.TextView a17 = binding.a();
        java.lang.CharSequence text2 = binding.a().getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        a17.setText(eVar.b(text2, query, color));
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new em.x1(holder.f3639x46306858);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        em.x1 binding = (em.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (binding.f336446g == null) {
            binding.f336446g = (android.widget.CheckBox) binding.f336440a.findViewById(com.p314xaae8f345.mm.R.id.bsc);
        }
        android.widget.CheckBox checkBox = binding.f336446g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(checkBox, "getCheckBox(...)");
        return checkBox;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        em.x1 binding = (em.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.view.View view = binding.f336440a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.x1 binding = (em.x1) obj;
        dd5.r0 r0Var2 = (dd5.r0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (r0Var2 == null) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.widget.TextView e17 = binding.e();
        ((ke0.e) xVar).getClass();
        e17.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, r0Var2.f310805b));
        if (binding.f336442c == null) {
            binding.f336442c = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688) binding.f336440a.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688 c21832xcd3ee688 = binding.f336442c;
        te5.i iVar = r0Var2.f310807d;
        c21832xcd3ee688.setImageResource(iVar.f500205d);
        binding.a().setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, r0Var2.f310806c));
        java.lang.String str = iVar.f500206e;
        if (!r26.n0.N(str)) {
            binding.d().setText(str);
            binding.d().setTextColor(context.getResources().getColor(iVar.f500208g, null));
            android.widget.TextView d17 = binding.d();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(d17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(d17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.widget.TextView d18 = binding.d();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(d18, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(d18, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            d18.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(d18, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onBindView", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(d18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int color = context.getResources().getColor(te5.j.f500219a.b(iVar.f500207f), null);
        binding.c().m82040x7541828(color);
        binding.b().m82114x7d38f3f4(color);
        int i17 = iVar.f500202a;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 == 4) {
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b17 = binding.b();
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(b17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        arrayList6.add(java.lang.Integer.valueOf(intValue3));
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(b17, arrayList6.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        binding.b().m82112x7e1bd1fe(false);
                        binding.b().m82113x3ae760af(iVar.f500204c);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c17 = binding.c();
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(c17, arrayList7.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue4 = ((java.lang.Integer) arrayList7.get(0)).intValue();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList();
                        arrayList8.add(java.lang.Integer.valueOf(intValue4));
                        java.util.Collections.reverse(arrayList8);
                        yj0.a.d(c17, arrayList8.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        c17.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                        yj0.a.f(c17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(c17, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        binding.c().setImageResource(com.p314xaae8f345.mm.R.raw.f78417x547e8b9f);
                        return;
                    }
                    if (i17 != 9) {
                        if (!iVar.f500203b) {
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b18 = binding.b();
                            java.util.ArrayList arrayList9 = new java.util.ArrayList();
                            arrayList9.add(8);
                            java.util.Collections.reverse(arrayList9);
                            yj0.a.d(b18, arrayList9.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            int intValue5 = ((java.lang.Integer) arrayList9.get(0)).intValue();
                            java.util.ArrayList arrayList10 = new java.util.ArrayList();
                            arrayList10.add(java.lang.Integer.valueOf(intValue5));
                            java.util.Collections.reverse(arrayList10);
                            yj0.a.d(b18, arrayList10.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            b18.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                            yj0.a.f(b18, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            yj0.a.f(b18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c18 = binding.c();
                            java.util.ArrayList arrayList11 = new java.util.ArrayList();
                            arrayList11.add(8);
                            java.util.Collections.reverse(arrayList11);
                            yj0.a.d(c18, arrayList11.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            int intValue6 = ((java.lang.Integer) arrayList11.get(0)).intValue();
                            java.util.ArrayList arrayList12 = new java.util.ArrayList();
                            arrayList12.add(java.lang.Integer.valueOf(intValue6));
                            java.util.Collections.reverse(arrayList12);
                            yj0.a.d(c18, arrayList12.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            c18.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
                            yj0.a.f(c18, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            yj0.a.f(c18, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b19 = binding.b();
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        arrayList13.add(0);
                        java.util.Collections.reverse(arrayList13);
                        yj0.a.d(b19, arrayList13.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue7 = ((java.lang.Integer) arrayList13.get(0)).intValue();
                        java.util.ArrayList arrayList14 = new java.util.ArrayList();
                        arrayList14.add(java.lang.Integer.valueOf(intValue7));
                        java.util.Collections.reverse(arrayList14);
                        yj0.a.d(b19, arrayList14.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        b19.setVisibility(((java.lang.Integer) arrayList14.get(0)).intValue());
                        yj0.a.f(b19, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(b19, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        binding.b().m82112x7e1bd1fe(false);
                        binding.b().m82113x3ae760af(iVar.f500204c);
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c19 = binding.c();
                        java.util.ArrayList arrayList15 = new java.util.ArrayList();
                        arrayList15.add(8);
                        java.util.Collections.reverse(arrayList15);
                        yj0.a.d(c19, arrayList15.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        int intValue8 = ((java.lang.Integer) arrayList15.get(0)).intValue();
                        java.util.ArrayList arrayList16 = new java.util.ArrayList();
                        arrayList16.add(java.lang.Integer.valueOf(intValue8));
                        java.util.Collections.reverse(arrayList16);
                        yj0.a.d(c19, arrayList16.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        c19.setVisibility(((java.lang.Integer) arrayList16.get(0)).intValue());
                        yj0.a.f(c19, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        yj0.a.f(c19, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b27 = binding.b();
            java.util.ArrayList arrayList17 = new java.util.ArrayList();
            arrayList17.add(0);
            java.util.Collections.reverse(arrayList17);
            yj0.a.d(b27, arrayList17.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue9 = ((java.lang.Integer) arrayList17.get(0)).intValue();
            java.util.ArrayList arrayList18 = new java.util.ArrayList();
            arrayList18.add(java.lang.Integer.valueOf(intValue9));
            java.util.Collections.reverse(arrayList18);
            yj0.a.d(b27, arrayList18.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b27.setVisibility(((java.lang.Integer) arrayList18.get(0)).intValue());
            yj0.a.f(b27, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(b27, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            binding.b().m82112x7e1bd1fe(false);
            binding.b().m82113x3ae760af(iVar.f500204c);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c27 = binding.c();
            java.util.ArrayList arrayList19 = new java.util.ArrayList();
            arrayList19.add(0);
            java.util.Collections.reverse(arrayList19);
            yj0.a.d(c27, arrayList19.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue10 = ((java.lang.Integer) arrayList19.get(0)).intValue();
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            arrayList20.add(java.lang.Integer.valueOf(intValue10));
            java.util.Collections.reverse(arrayList20);
            yj0.a.d(c27, arrayList20.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c27.setVisibility(((java.lang.Integer) arrayList20.get(0)).intValue());
            yj0.a.f(c27, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(c27, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            binding.c().setImageResource(com.p314xaae8f345.mm.R.raw.f78418xba0710d8);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b28 = binding.b();
        java.util.ArrayList arrayList21 = new java.util.ArrayList();
        arrayList21.add(0);
        java.util.Collections.reverse(arrayList21);
        yj0.a.d(b28, arrayList21.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue11 = ((java.lang.Integer) arrayList21.get(0)).intValue();
        java.util.ArrayList arrayList22 = new java.util.ArrayList();
        arrayList22.add(java.lang.Integer.valueOf(intValue11));
        java.util.Collections.reverse(arrayList22);
        yj0.a.d(b28, arrayList22.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b28.setVisibility(((java.lang.Integer) arrayList22.get(0)).intValue());
        yj0.a.f(b28, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b28, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        binding.b().m82112x7e1bd1fe(true);
        binding.b().m82113x3ae760af(iVar.f500204c);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c28 = binding.c();
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        arrayList23.add(8);
        java.util.Collections.reverse(arrayList23);
        yj0.a.d(c28, arrayList23.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue12 = ((java.lang.Integer) arrayList23.get(0)).intValue();
        java.util.ArrayList arrayList24 = new java.util.ArrayList();
        arrayList24.add(java.lang.Integer.valueOf(intValue12));
        java.util.Collections.reverse(arrayList24);
        yj0.a.d(c28, arrayList24.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c28.setVisibility(((java.lang.Integer) arrayList24.get(0)).intValue());
        yj0.a.f(c28, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "setupProgressAndMediaIcon", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/utils/ChattingFileViewHelper$FavFileBubbleModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c28, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.x1 binding = (em.x1) obj;
        dd5.r0 r0Var2 = (dd5.r0) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (r0Var2 == null) {
            return;
        }
        sc5.g gVar = sc5.g.f488105a;
        boolean z17 = sc5.g.f488106b;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = r0Var2.f310804a;
        if (z17) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
            gVar.f(context, f9Var, new sc5.h(uuid));
            return;
        }
        android.content.Intent putExtra = new android.content.Intent().setClassName(context, "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI").putExtra("app_msg_id", f9Var.m124847x74d37ac6()).putExtra("msg_talker", f9Var.Q0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(putExtra, "putExtra(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(putExtra);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onItemBodyClick", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "onItemBodyClick", "(Landroid/content/Context;Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;Lcom/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$ViewModel;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uc5.n
    public void v(android.content.Context context, in5.s0 holder, uc5.d dVar, java.lang.Object obj) {
        dd5.q0 item = (dd5.q0) dVar;
        em.x1 binding = (em.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        android.widget.TextView textView = binding.f336441b;
        android.view.View view = binding.f336440a;
        if (textView == null) {
            binding.f336441b = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.nec);
        }
        android.widget.TextView textView2 = binding.f336441b;
        android.content.res.Resources resources = context.getResources();
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = item.f310789h;
        java.lang.String d17 = g95.e0.d(f9Var);
        ((sg3.a) v0Var).getClass();
        textView2.setText(resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbm, c01.a2.e(d17)));
        if (binding.f336444e == null) {
            binding.f336444e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        }
        binding.f336444e.setText(k35.m1.f(context, f9Var.T1(), true, false));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // uc5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(android.content.Context r8, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof dd5.n0
            if (r0 == 0) goto L13
            r0 = r10
            dd5.n0 r0 = (dd5.n0) r0
            int r1 = r0.f310763h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f310763h = r1
            goto L18
        L13:
            dd5.n0 r0 = new dd5.n0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f310761f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f310763h
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3a
            if (r2 != r5) goto L32
            java.lang.Object r8 = r0.f310760e
            r9 = r8
            com.tencent.mm.storage.f9 r9 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) r9
            java.lang.Object r8 = r0.f310759d
            android.content.Context r8 = (android.content.Context) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L69
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.String r10 = r9.U1()
            if (r10 == 0) goto L4c
            boolean r2 = r26.n0.N(r10)
            if (r2 == 0) goto L4a
            goto L4c
        L4a:
            r2 = r3
            goto L4d
        L4c:
            r2 = r5
        L4d:
            r2 = r2 ^ r5
            if (r2 == 0) goto L51
            goto L52
        L51:
            r10 = r4
        L52:
            if (r10 != 0) goto L55
            return r4
        L55:
            kotlinx.coroutines.p0 r2 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            dd5.o0 r6 = new dd5.o0
            r6.<init>(r10, r4)
            r0.f310759d = r8
            r0.f310760e = r9
            r0.f310763h = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r2, r6, r0)
            if (r10 != r1) goto L69
            return r1
        L69:
            v05.b r10 = (v05.b) r10
            ez.v0 r0 = ez.v0.f339310a
            java.lang.String r0 = r0.g(r10)
            if (r0 != 0) goto L83
            android.content.res.Resources r0 = r8.getResources()
            r1 = 2131781883(0x7f1068fb, float:1.9195392E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.String r1 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
        L83:
            int r1 = r10.f513848e
            int r1 = r1 + 8
            com.tencent.mm.protobuf.f r1 = r10.m75936x14adae67(r1)
            v05.a r1 = (v05.a) r1
            if (r1 == 0) goto L93
            java.lang.String r4 = r1.r()
        L93:
            te5.j r1 = te5.j.f500219a
            te5.i r8 = r1.a(r9, r4, r8)
            int r1 = r10.f513848e
            int r1 = r1 + 8
            com.tencent.mm.protobuf.f r10 = r10.m75936x14adae67(r1)
            v05.a r10 = (v05.a) r10
            if (r10 == 0) goto Lad
            int r1 = r10.f449897d
            int r1 = r1 + r3
            long r1 = r10.m75942xfb822ef2(r1)
            goto Laf
        Lad:
            r1 = 0
        Laf:
            java.lang.String r10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(r1)
            dd5.r0 r1 = new dd5.r0
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            r1.<init>(r9, r0, r10, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dd5.p0.w(android.content.Context, com.tencent.mm.storage.f9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        em.x1 binding = (em.x1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.e().setText("");
        binding.a().setText("");
        binding.d().setText("");
        android.widget.TextView d17 = binding.d();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(d17, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(d17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(d17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(d17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (binding.f336442c == null) {
            binding.f336442c = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2666x4fe3eeaf.C21832xcd3ee688) binding.f336440a.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        }
        binding.f336442c.setImageDrawable(null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2764xc454c22d.C22713x95c5cea1 b17 = binding.b();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(b17, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(b17, arrayList4.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        b17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(b17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(b17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c17 = binding.c();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(c17, arrayList5.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue3 = ((java.lang.Integer) arrayList5.get(0)).intValue();
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(java.lang.Integer.valueOf(intValue3));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(c17, arrayList6.toArray(), "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c17.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/ui/chatting/history/types/MsgHistoryGalleryTypeFile$Convert", "reset", "(Lcom/tencent/mm/autogen/viewbinding/MsgHistoryGalleryFileItemViewVB;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(c17, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
