package ox2;

/* loaded from: classes8.dex */
public abstract class r0 {
    public static final void a(android.widget.ImageView imageView, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb, boolean z17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        if (interfaceC4987x84e327cb != null) {
            try {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.u5.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                if (interfaceC4987x84e327cb instanceof com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) {
                    zq.h.f556505a.d((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, imageView, null);
                }
                if (z17) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(java.lang.Integer.valueOf(intValue));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCover ");
                sb6.append(source);
                sb6.append(" error: ");
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "";
                }
                sb6.append(message);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("safeLoadInteractionEasterEggEmoji", sb6.toString());
                if (z17) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(imageView, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(java.lang.Integer.valueOf(intValue2));
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(imageView, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    imageView.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(imageView, "com/tencent/mm/plugin/finder/view/interactioneasteregg/InteractionEasterEggImageViewExtKt", "safeLoadInteractionEasterEggEmoji", "(Landroid/widget/ImageView;Lcom/tencent/mm/api/IEmojiInfo;ZLjava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }
}
