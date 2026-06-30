package jn2;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382235d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(jn2.w wVar) {
        super(0);
        this.f382235d = wVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        int i17;
        android.text.Editable text;
        jn2.w wVar = this.f382235d;
        android.widget.EditText editText = wVar.f382258i;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (wVar.f382271y) {
            wVar.f382271y = false;
            android.widget.EditText editText2 = wVar.f382258i;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            if (str.length() == 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = wVar.f382259m;
                if (c22699x3dcdb352 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget$setupSearchInput$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                wVar.f382256g.mo152xb9724478();
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = wVar.f382262p;
                if (c1073x7e08a787 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1073x7e08a787, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c1073x7e08a787.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1073x7e08a787, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c1073x7e08a787.setEnabled(false);
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = wVar.f382265s;
                if (c1073x7e08a7872 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c1073x7e08a7872, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c1073x7e08a7872.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c1073x7e08a7872, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = wVar.f382263q;
                if (c1163xf1deaba4 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(c1163xf1deaba4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c1163xf1deaba4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.TextView textView = wVar.f382266t;
                if (textView != null) {
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                    arrayList5.add(8);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(textView, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    textView.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = wVar.f382261o;
                if (c1073x7e08a7873 != null) {
                    java.util.ArrayList arrayList6 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                    arrayList6.add(0);
                    java.util.Collections.reverse(arrayList6);
                    yj0.a.d(c1073x7e08a7873, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c1073x7e08a7873.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                    yj0.a.f(c1073x7e08a7873, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongAddPanelSearchWidget", "showSmartBoxLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i17 = 1;
                    c1073x7e08a7873.setEnabled(true);
                } else {
                    i17 = 1;
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = wVar.f382272z;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, i17, null);
                }
                wVar.f382272z = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new jn2.s(wVar, str, null), 3, null);
                hn2.k.f364067a.a(str, wVar.f382259m, wVar.f382260n);
            }
        }
        return jz5.f0.f384359a;
    }
}
