package ke5;

/* loaded from: classes9.dex */
public final class a0 extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f388587i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f388588j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f388589k;

    /* renamed from: l, reason: collision with root package name */
    public int f388590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yb5.d chattingContext, hd5.r loader) {
        super(chattingContext, loader);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loader, "loader");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = chattingContext.f542250l;
        java.lang.String m78394x7e63ed49 = abstractC21611x7536149b.m78394x7e63ed49("key_template_msg_username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78394x7e63ed49, "getStringExtra(...)");
        this.f388587i = m78394x7e63ed49;
        java.lang.String m78394x7e63ed492 = abstractC21611x7536149b.m78394x7e63ed49("key_template_msg_id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78394x7e63ed492, "getStringExtra(...)");
        this.f388588j = m78394x7e63ed492;
        java.lang.Boolean m78383x21a1233e = abstractC21611x7536149b.m78383x21a1233e("key_is_service_voip_template_msg", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78383x21a1233e, "getBooleanExtra(...)");
        this.f388589k = m78383x21a1233e.booleanValue();
    }

    @Override // ke5.a, hd5.k
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q result) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        super.c(c21897x17252689, result);
        java.util.List list = result.f362166e;
        int size = ((java.util.LinkedList) result.f362164c).size();
        int i17 = result.f362167f;
        this.f388590l += size;
        boolean isEmpty = list.isEmpty();
        yb5.d dVar = this.f388574b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.j(dVar.f542250l, com.p314xaae8f345.mm.R.id.f569117qh1);
        android.view.View c17 = dVar.c(com.p314xaae8f345.mm.R.id.qeo);
        if (c17 == null) {
            z17 = false;
        } else {
            int i18 = isEmpty ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            z17 = false;
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingTemplateMsgPresenter", "onEmptyViewShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/ui/chatting/source/presenter/ChattingTemplateMsgPresenter", "onEmptyViewShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (list.isEmpty()) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.z4.j(dVar.f542250l, com.p314xaae8f345.mm.R.id.f569117qh1);
        }
        int i19 = this.f388589k ? i17 : 10;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingTemplateMsgPresenter", "addedCount: " + this.f388590l + ", allCount: " + i17 + ", preAddCount: " + this.f388576d);
        if (this.f388590l >= i19 || this.f388576d >= i17) {
            c21897x17252689.m79088x648e109b(true);
        } else {
            a(hd5.n.ACTION_MORE_PAGE, z17, null);
        }
        if (result.f362163b == hd5.n.ACTION_ENTER) {
            dVar.N(z17);
        }
        c21897x17252689.m79085xcc8bf2ed(true);
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        int n76 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).n7(this.f388587i, 318767153);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingTemplateMsgPresenter", "action: " + nVar + ", totalCount: " + n76);
        if (this.f388589k && (nVar == hd5.n.ACTION_ENTER || nVar == hd5.n.ACTION_UPDATE)) {
            this.f388590l = 0;
        }
        int i17 = nVar == null ? -1 : ke5.z.f388691a[nVar.ordinal()];
        if (i17 == 1 || i17 == 2) {
            return new he5.p(this.f388587i, 10, n76, this.f388588j, this.f388589k);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return new he5.p(this.f388587i, this.f388590l + 10, n76, this.f388588j, this.f388589k);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingTemplateMsgPresenter", "illegal action type.");
        }
        return null;
    }
}
