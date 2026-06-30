package hz;

@j95.b
/* loaded from: classes9.dex */
public final class d extends jm0.o implements iz.e {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(jz.f.class);
    }

    public qi3.b0 Zi(hz.m params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsgFeatureService", "createSendContactCardTask: toUser=" + params.f367766a + ", contentUser=" + params.f367767b);
        return new hz.h(params);
    }

    public void aj(qi3.b0 task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactCardMsgFeatureService", "sendSync: starting task " + task.id());
        boolean z17 = task instanceof qi3.c;
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendSync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        if (!z17) {
            throw new java.lang.UnsupportedOperationException("sendAsync only supports BaseSendMsgTask, got ".concat(task.getClass().getName()));
        }
        jz5.g gVar = jz.f.f384093g;
        hz.d dVar = (hz.d) i95.n0.c(hz.d.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        if (!jm0.g.class.isAssignableFrom(jz.f.class)) {
            throw new java.lang.IllegalArgumentException(hz.d.class.getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(dVar.getViewModel(), new jm0.e(dVar)).a(jz.f.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        qi3.c cVar = (qi3.c) task;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 b17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.b(2, 0, null, 6, null);
        cVar.f445211g = b17;
        v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20977x242e434b) ((jz5.n) ((jz.f) ((jm0.g) a17)).f384094f).mo141623x754a37bb(), null, new jz.d(cVar, null), 1, null);
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = gm0.j1.b().f354778h.f354678e;
        if (c20976x6ba6452a == null || v65.i.b(c20976x6ba6452a, null, new hz.c(b17, null), 1, null) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactCardMsgFeatureService", "sendSync: accountScope is null, cannot execute task " + task.id());
        }
    }
}
