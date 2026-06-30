package z53;

/* loaded from: classes8.dex */
public final class n {
    public n(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.util.List conversations, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversations, "conversations");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (conversations.isEmpty()) {
            callback.mo149xb9724478(java.lang.Boolean.TRUE, kz5.p0.f395529d);
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = conversations.iterator();
        while (it.hasNext()) {
            z53.i iVar = (z53.i) it.next();
            java.util.List list = (java.util.List) hashMap.get(iVar.f67670x114ef53e);
            if (list != null) {
                list.add(iVar);
            } else {
                java.lang.String field_talker = iVar.f67670x114ef53e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_talker, "field_talker");
                hashMap.put(field_talker, kz5.c0.k(iVar));
            }
            hashSet.add(iVar.f67670x114ef53e);
            hashSet.add(iVar.f67668x5568d387);
        }
        ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(kz5.n0.S0(hashSet), new z53.l(callback, conversations, hashMap));
    }

    public final void b(z53.i conversation, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(conversation, "conversation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        a(kz5.b0.c(conversation), new z53.k(callback));
    }

    public final void c(int i17, int i18, yz5.p callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.List<z53.i> Ca = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().Ca(i17, i18);
        for (z53.i iVar : Ca) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().mo560xd586ddb5(iVar.f67668x5568d387);
        }
        z53.o.f551794a.a(Ca, new z53.m(callback));
    }
}
