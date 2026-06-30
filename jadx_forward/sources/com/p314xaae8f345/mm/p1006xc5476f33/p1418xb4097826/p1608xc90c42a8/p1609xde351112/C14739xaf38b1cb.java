package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgViewCallback$finishLoadMore$1 */
/* loaded from: classes10.dex */
public final class C14739xaf38b1cb extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback f204408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f204410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f204411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14739xaf38b1cb(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback, java.util.List list, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(0);
        this.f204408d = msgViewCallback;
        this.f204409e = list;
        this.f204410f = z17;
        this.f204411g = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        dm.pd pdVar;
        int i18;
        int i19;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgViewCallback msgViewCallback = this.f204408d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14727x5e078d.MsgPresenter msgPresenter = msgViewCallback.f204392f;
        java.util.ArrayList raw = msgPresenter.f204361i;
        java.util.List increment = this.f204409e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(increment, "increment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(raw, "raw");
        boolean isEmpty = raw.isEmpty();
        java.lang.String str = msgPresenter.f204359g;
        if (isEmpty) {
            raw.addAll(increment);
        } else {
            raw.get(kz5.c0.h(raw));
            for (so2.i iVar : kz5.n0.x0(increment)) {
                java.util.Iterator it = raw.iterator();
                int i28 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i17 = -1;
                        i28 = -1;
                        break;
                    }
                    dm.pd pdVar2 = ((so2.i) it.next()).f491944d;
                    long j17 = pdVar2.f66095xc8a07680;
                    dm.pd pdVar3 = iVar.f491944d;
                    if (j17 == pdVar3.f66095xc8a07680 && pdVar2.f66080xac3be4e == pdVar3.f66080xac3be4e) {
                        i17 = -1;
                        break;
                    }
                    i28++;
                }
                if (i28 == i17) {
                    dm.pd pdVar4 = iVar.f491944d;
                    if (pdVar4.f66129x2262335f == 10 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(pdVar4.f66073x6066efac)) {
                        java.util.Iterator it6 = raw.iterator();
                        int i29 = 0;
                        while (true) {
                            boolean hasNext = it6.hasNext();
                            pdVar = iVar.f491944d;
                            if (!hasNext) {
                                i18 = -1;
                                break;
                            }
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((so2.i) it6.next()).f491944d.f66073x6066efac, pdVar.f66073x6066efac)) {
                                i18 = i29;
                                break;
                            }
                            i29++;
                        }
                        if (i18 >= 0) {
                            raw.remove(i18);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "remove same clientMsgId, " + pdVar.f66073x6066efac);
                        }
                    }
                    raw.add(iVar);
                } else {
                    raw.set(i28, iVar);
                }
            }
            kz5.g0.t(raw, new java.util.Comparator() { // from class: com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract$MsgPresenter$sortMentionList$comparator$1
                @Override // java.util.Comparator
                public int compare(java.lang.Object obj, java.lang.Object obj2) {
                    dm.pd pdVar5 = ((so2.i) obj).f491944d;
                    int i37 = pdVar5.f66080xac3be4e;
                    dm.pd pdVar6 = ((so2.i) obj2).f491944d;
                    int i38 = pdVar6.f66080xac3be4e;
                    return i37 == i38 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.j(pdVar6.f66095xc8a07680, pdVar5.f66095xc8a07680) : p3321xbce91901.jvm.p3324x21ffc6bd.o.i(i38, i37);
                }
            });
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "increment size " + increment.size());
        if ((!increment.isEmpty()) && msgPresenter.f204362m > 0) {
            java.util.ListIterator listIterator = raw.listIterator(raw.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    i27 = -1;
                    break;
                }
                if (((so2.i) listIterator.previous()).f491944d.f66095xc8a07680 == msgPresenter.f204362m) {
                    i27 = listIterator.nextIndex();
                    break;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "unread index " + i27 + ", raw size " + raw.size());
            if (i27 != -1) {
                if (i27 >= 0) {
                    int i37 = 0;
                    while (true) {
                        ((so2.i) raw.get(i37)).f491945e = false;
                        if (i37 == i27) {
                            break;
                        }
                        i37++;
                    }
                }
                if (i27 != kz5.c0.h(raw)) {
                    ((so2.i) raw.get(i27)).f491945e = true;
                }
            }
        }
        if (msgViewCallback.f204392f.f204361i.isEmpty()) {
            i19 = 0;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14752x6c10ad9a(msgViewCallback.m130335x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.epa), msgViewCallback, false, msgViewCallback.m130335x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a)));
        } else {
            i19 = 0;
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14752x6c10ad9a(null, msgViewCallback, false, 0));
        }
        if (this.f204410f) {
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = msgViewCallback.f204396m;
            if (c22801x87cbdc00 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc00.P(i19);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = msgViewCallback.f204395i;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
            if (mo7946xf939df19 != null) {
                mo7946xf939df19.m8146xced61ae5();
            }
        } else {
            ym5.s3 s3Var = new ym5.s3(1);
            s3Var.f545055g = false;
            s3Var.f545054f = true ^ increment.isEmpty();
            s3Var.f545056h = increment.size();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = msgViewCallback.f204395i;
            if (c1163xf1deaba42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42.mo7946xf939df19();
            if (mo7946xf939df192 != null) {
                mo7946xf939df192.m8153xd399a4d9(this.f204411g.f391649d, increment.size());
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc002 = msgViewCallback.f204396m;
            if (c22801x87cbdc002 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rlLayout");
                throw null;
            }
            c22801x87cbdc002.mo56054xc12c74c0(s3Var);
        }
        return jz5.f0.f384359a;
    }
}
