package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class sm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14100x98db42b4 f192075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 f192076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14100x98db42b4 activityC14100x98db42b4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1) {
        super(0);
        this.f192075d = activityC14100x98db42b4;
        this.f192076e = c13852x2d33c3a1;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14100x98db42b4 activityC14100x98db42b4 = this.f192075d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 y00Var = activityC14100x98db42b4.f191102u;
        if (y00Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View f294968x = y00Var.f187713m.getF294968x();
        if (f294968x != null && (textView = (android.widget.TextView) f294968x.findViewById(com.p314xaae8f345.mm.R.id.ili)) != null) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 y00Var2 = activityC14100x98db42b4.f191102u;
        if (y00Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View f294968x2 = y00Var2.f187713m.getF294968x();
        android.widget.TextView textView2 = f294968x2 != null ? (android.widget.TextView) f294968x2.findViewById(com.p314xaae8f345.mm.R.id.ili) : null;
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y00 y00Var3 = activityC14100x98db42b4.f191102u;
        if (y00Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
            throw null;
        }
        android.view.View f294968x3 = y00Var3.f187713m.getF294968x();
        android.view.View findViewById = f294968x3 != null ? f294968x3.findViewById(com.p314xaae8f345.mm.R.id.ilg) : null;
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI$initOnCreate$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/ui/FinderTingAudioCollectionUI$initOnCreate$1$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a1 = activityC14100x98db42b4.f191103v;
        if (c13852x2d33c3a1 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        if (c13852x2d33c3a1.m56387xe6796cde().size() != activityC14100x98db42b4.f191106y) {
            java.lang.String b17 = this.f192076e.getB();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchEndCallback: refresh count, old=");
            sb6.append(activityC14100x98db42b4.f191106y);
            sb6.append(", new=");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a12 = activityC14100x98db42b4.f191103v;
            if (c13852x2d33c3a12 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            sb6.append(c13852x2d33c3a12.m56387xe6796cde().size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b17, sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13852x2d33c3a1 c13852x2d33c3a13 = activityC14100x98db42b4.f191103v;
            if (c13852x2d33c3a13 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
                throw null;
            }
            activityC14100x98db42b4.f191106y = c13852x2d33c3a13.m56387xe6796cde().size();
            activityC14100x98db42b4.mo54450xbf7c1df6(activityC14100x98db42b4.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f0b, java.lang.Integer.valueOf(activityC14100x98db42b4.f191106y)));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_audio_collection_count", activityC14100x98db42b4.f191106y);
            activityC14100x98db42b4.setResult(-1, intent);
        }
        return jz5.f0.f384359a;
    }
}
