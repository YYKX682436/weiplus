package we5;

/* loaded from: classes9.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] f526861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526862e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f526863f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2) {
        super(1);
        this.f526861d = z0VarArr;
        this.f526862e = h0Var;
        this.f526863f = h0Var2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao it = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.ArrayList arrayList = it.f284922l;
        arrayList.clear();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] textSpans = this.f526861d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textSpans, "$textSpans");
        for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : textSpans) {
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f526862e;
            int[] iArr = {((android.text.SpannableString) h0Var.f391656d).getSpanStart(z0Var), ((android.text.SpannableString) h0Var.f391656d).getSpanEnd(z0Var), com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.y(z0Var)};
            if (iArr[1] - iArr[0] < ((java.lang.String) this.f526863f.f391656d).length()) {
                arrayList.add(iArr);
            }
        }
        return jz5.f0.f384359a;
    }
}
