package qb2;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.b0 f442840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f442841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(qb2.b0 b0Var, l75.w0 w0Var) {
        super(0);
        this.f442840d = b0Var;
        this.f442841e = w0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        qb2.b0 b0Var = this.f442840d;
        java.lang.String str = b0Var.f442700f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onConversationStorageChange] convScene = ");
        sb6.append(b0Var.f442708q);
        sb6.append(",eventData.eventId = ");
        l75.w0 w0Var = this.f442841e;
        sb6.append(w0Var.f398507b);
        sb6.append(',');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int i17 = w0Var.f398507b;
        if (i17 == 1 || i17 == 2) {
            java.lang.Object obj = w0Var.f398509d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
            qb2.b0.B(b0Var, (qb2.t) obj);
        } else {
            java.util.ArrayList arrayList = b0Var.f442705n;
            java.util.HashMap hashMap = b0Var.f442706o;
            if (i17 == 5) {
                java.lang.Object obj2 = w0Var.f398509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.t tVar = (qb2.t) obj2;
                int i18 = tVar.f65869x2262335f;
                if (i18 == 1 && b0Var.f442707p == 1) {
                    qb2.t tVar2 = (qb2.t) hashMap.get("findersayhisessionholder");
                    if (tVar2 != null) {
                        tVar2.f65870xa35b5abb = 0;
                        tVar2.f65861x9b4f418d = 1;
                        int indexOf = arrayList.indexOf(tVar);
                        if (indexOf >= 0 && indexOf < arrayList.size()) {
                            b0Var.p(indexOf);
                        }
                    }
                } else if (i18 == 3 && b0Var.f442707p == 1) {
                    qb2.t tVar3 = (qb2.t) hashMap.get("finderaliassessionholder");
                    if (tVar3 != null) {
                        tVar3.f65870xa35b5abb = 0;
                        tVar3.f65861x9b4f418d = 1;
                        int indexOf2 = arrayList.indexOf(tVar);
                        if (indexOf2 >= 0 && indexOf2 < arrayList.size()) {
                            b0Var.p(indexOf2);
                        }
                    }
                } else {
                    int c07 = kz5.n0.c0(arrayList, (qb2.t) hashMap.get(tVar.f65866xbed8694c));
                    tVar.u0();
                    if (c07 >= 0 && c07 < arrayList.size()) {
                        arrayList.set(c07, tVar);
                        java.lang.String field_sessionId = tVar.f65866xbed8694c;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
                        hashMap.put(field_sessionId, tVar);
                        if (c07 >= 0 && c07 < arrayList.size()) {
                            b0Var.p(c07);
                        }
                    }
                }
            } else if (i17 == 6) {
                java.lang.Object obj3 = w0Var.f398509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.t tVar4 = (qb2.t) obj3;
                int c08 = kz5.n0.c0(arrayList, (qb2.t) hashMap.get(tVar4.f65866xbed8694c));
                if (c08 >= 0 && c08 < arrayList.size()) {
                    arrayList.remove(c08);
                    hashMap.remove(tVar4.f65866xbed8694c);
                    b0Var.w(c08);
                }
            } else if (i17 == 7) {
                java.lang.Object obj4 = w0Var.f398509d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.conv.FinderConversation");
                qb2.b0.B(b0Var, (qb2.t) obj4);
            }
        }
        return jz5.f0.f384359a;
    }
}
