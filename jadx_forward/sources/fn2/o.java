package fn2;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s f345874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fn2.s sVar) {
        super(0);
        this.f345874d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        android.text.Editable text;
        fn2.s sVar = this.f345874d;
        android.widget.EditText editText = sVar.f345906i;
        if (editText == null || (text = editText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        if (sVar.f345914t) {
            sVar.f345914t = false;
            android.widget.EditText editText2 = sVar.f345906i;
            if (editText2 != null) {
                editText2.setSelection(str.length());
            }
        } else {
            if (str.length() == 0) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = sVar.f345907m;
                if (c22699x3dcdb352 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c22699x3dcdb352, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/finder/live/widget/requestsong/FinderLiveRequestSongSearchWidget$initSearchView$3", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            } else {
                sVar.f345904g.mo152xb9724478();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar = sVar.f345912r;
                if (dvVar != null) {
                    dvVar.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar2 = sVar.f345913s;
                if (dvVar2 != null) {
                    dvVar2.b();
                }
                p3325xe03a0797.p3326xc267989b.r2 r2Var = sVar.f345915u;
                if (r2Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                }
                sVar.f345915u = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new fn2.n(sVar, str, null), 3, null);
                hn2.k.f364067a.a(str, sVar.f345907m, sVar.f345908n);
            }
        }
        return jz5.f0.f384359a;
    }
}
