package ke5;

/* loaded from: classes9.dex */
public class y extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f388677i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f388678j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388679k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388680l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f388681m;

    /* renamed from: n, reason: collision with root package name */
    public final long f388682n;

    /* renamed from: o, reason: collision with root package name */
    public int f388683o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f388684p;

    public y(yb5.d dVar, hd5.r rVar) {
        super(dVar, rVar);
        this.f388677i = 0;
        this.f388679k = 0L;
        this.f388680l = 0L;
        this.f388681m = 0L;
        this.f388683o = 0;
        java.lang.String m78394x7e63ed49 = dVar.f542250l.m78394x7e63ed49("key_notify_message_real_username");
        this.f388678j = m78394x7e63ed49;
        this.f388682n = dVar.f542250l.m78388x5a3fc3e("biz_last_unread_create_time", 0L);
        this.f388684p = te5.s1.f500280a.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[ChattingSingleNotifyMsgPresenter] talker:%s", m78394x7e63ed49);
    }

    @Override // ke5.a, ke5.f0
    public void a(hd5.n nVar, boolean z17, android.os.Bundle bundle) {
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jk) ((sb5.u1) this.f388574b.f542241c.a(sb5.u1.class))).f280831i && nVar == hd5.n.ACTION_ENTER) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "onLoad isFromServiceNotifyContentSearch ignore action enter");
        } else {
            super.a(nVar, z17, bundle);
        }
    }

    @Override // ke5.a, hd5.k
    public void c(final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, final hd5.q qVar) {
        final int i17;
        super.c(c21897x17252689, qVar);
        hd5.n nVar = qVar.f362163b;
        java.util.List list = qVar.f362166e;
        int size = ((java.util.LinkedList) qVar.f362164c).size();
        int i18 = qVar.f362167f;
        final int i19 = qVar.f362168g;
        android.os.Bundle bundle = qVar.f362162a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(0);
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) list.get(list.size() - 1);
        if (f9Var != null) {
            this.f388679k = f9Var.mo78012x3fdd41df();
        }
        if (f9Var2 != null) {
            this.f388680l = f9Var2.mo78012x3fdd41df();
        }
        if (this.f388684p && (i17 = this.f388683o) > 0) {
            this.f388683o = 0;
            final sb5.z zVar = (sb5.z) this.f388574b.f542241c.a(sb5.z.class);
            c21897x17252689.m79872xcc101dd9().m75893x3498a0(new java.lang.Runnable() { // from class: ke5.y$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) sb5.z.this;
                    kVar.V0(kVar.mo8143x7444f759() - i17);
                }
            });
        }
        int ordinal = nVar.ordinal();
        if (ordinal == 0) {
            c21897x17252689.d(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), (c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2()) + 1, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0() + c21897x17252689.m79077xde699c26(), false, false);
            int m79870x9b948425 = c21897x17252689.m79870x9b948425() - c21897x17252689.m79874x2d2219a2();
            if (m79870x9b948425 > 0) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f388574b.f542241c.a(sb5.z.class))).I0(m79870x9b948425);
            }
        } else if (ordinal == 1) {
            c21897x17252689.c(false);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21897x17252689.m79872xcc101dd9(), c21897x17252689.m79874x2d2219a2() + 1, (c21897x17252689.m79872xcc101dd9().m75888x1c4fb41d() - ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.pe) ((sb5.z0) this.f388574b.f542241c.a(sb5.z0.class))).r0()) - c21897x17252689.m79074xd3ae1da8(), false, false);
        } else if (ordinal == 3) {
            this.f388574b.N(false);
        } else if (ordinal == 4) {
            int i27 = bundle == null ? -1 : bundle.getInt("MSG_POSITION", -1);
            if (i27 != -1) {
                i19 = java.lang.Math.max(0, c21897x17252689.m79870x9b948425() - (qVar.f362167f - i27));
                qVar.f362168g = i19;
            }
            if (this.f388574b.f542250l.m78386x9c19e6d7("container_enter_scene", 0) == 2) {
                h(i19, c21897x17252689, qVar);
            } else {
                c21897x17252689.m79872xcc101dd9().m75893x3498a0(new java.lang.Runnable() { // from class: ke5.y$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        ke5.y.this.h(i19, c21897x17252689, qVar);
                    }
                });
            }
        }
        if (nVar != hd5.n.ACTION_ENTER) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[onViewUpdate] mode:%s lastTopMsgCreateTime:%s lastBottomMsgCreateTime:%s loadedCount:%s allCount:%s selection:%s", nVar, java.lang.Long.valueOf(this.f388679k), java.lang.Long.valueOf(this.f388680l), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingSingleNotifyMsgPresenter", "[isShowTopAll] talker:%s loadedCount:%s allCount:%s", this.f388678j, java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(i18));
            c21897x17252689.m79088x648e109b(i18 <= size);
            c21897x17252689.m79085xcc8bf2ed(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r11 > 0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e4  */
    @Override // ke5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public he5.t e(hd5.n r25, android.os.Bundle r26, hd5.q r27) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.y.e(hd5.n, android.os.Bundle, hd5.q):he5.t");
    }

    public final void h(int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689, hd5.q qVar) {
        android.os.Bundle bundle = qVar.f362162a;
        yb5.d dVar = this.f388574b;
        sb5.z zVar = (sb5.z) dVar.f542241c.a(sb5.z.class);
        if (bundle != null && bundle.getInt("SCENE", 0) == 1) {
            boolean z17 = bundle.getBoolean("IS_IDLE_VISBLE", false);
            int i18 = bundle.getInt("SELECTION_TOP_OFFSET", 0);
            boolean z18 = bundle.getBoolean("IS_SMOOTH_SCROLL", false);
            dVar.f542253o = i17;
            g(i17, z17, i18, z18);
            if (i17 < 0 || !dVar.f542250l.m78383x21a1233e("need_hight_item", false).booleanValue()) {
                return;
            }
            f(c21897x17252689, i17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g, false, i18, false, bundle);
            return;
        }
        if (bundle == null || bundle.getInt("SCENE", 0) != 2) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).V0(i17);
        yb5.d dVar2 = this.f388574b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar2, arrayList.toArray(), "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter", "handleScrollToPositionImpl", "(ILcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
        dVar2.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/source/presenter/ChattingSingleNotifyMsgPresenter", "handleScrollToPositionImpl", "(ILcom/tencent/mm/ui/chatting/view/MMChattingListView;Lcom/tencent/mm/ui/chatting/loader/IDataLoader$LoadedResult;)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
