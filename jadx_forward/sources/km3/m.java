package km3;

/* loaded from: classes10.dex */
public final class m {
    public m(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(android.widget.TextView textView, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b c15635xf0ea441b, int i17, int i18) {
        km3.p pVar;
        if (textView == null || view == null || c15635xf0ea441b == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Music.MusicMvAlbumAdapter", "Error input for duration fetcher");
            return;
        }
        java.util.HashMap hashMap = km3.p.f390784m;
        if (hashMap.containsKey(textView) && (pVar = (km3.p) hashMap.get(textView)) != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f390787f, c15635xf0ea441b)) {
                return;
            }
            java.lang.ref.WeakReference weakReference = pVar.f390785d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView, weakReference.get())) {
                pVar.f390785d = new java.lang.ref.WeakReference(null);
                pVar.f390786e = new java.lang.ref.WeakReference(null);
                pVar.f390789h = true;
            }
        }
        int i19 = c15635xf0ea441b.f219979x;
        if (i19 >= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Music.MusicMvAlbumAdapter", "Directly attach durationMs %d to tv, path %s", java.lang.Integer.valueOf(i19), c15635xf0ea441b);
            b(textView, view, c15635xf0ea441b.f219979x, i17, i18, c15635xf0ea441b.f219975t);
            hashMap.remove(textView);
        } else {
            textView.setText("");
            km3.p pVar2 = new km3.p(textView, view, c15635xf0ea441b, new km3.l(i17, i18), null);
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            t23.p0.n().b(pVar2);
            hashMap.put(textView, pVar2);
        }
    }

    public final void b(android.widget.TextView textView, android.view.View view, int i17, int i18, int i19, boolean z17) {
        if (textView == null) {
            return;
        }
        if (i17 < 0) {
            textView.setText("--:--");
            return;
        }
        int a17 = lm3.d0.a(i17);
        int c17 = lm3.d0.c(i18);
        int b17 = lm3.d0.b(i19);
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (a17 < c17 || a17 > b17 || z17) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.1f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/adapter/MusicMvAlbumAdapter$SimpleVideoAnalysisTask$Companion", "setResult", "(Landroid/widget/TextView;Landroid/view/View;IIIZ)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
        java.lang.String valueOf = java.lang.String.valueOf(a17 % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        textView.setText((a17 / 60) + ':' + valueOf);
    }
}
