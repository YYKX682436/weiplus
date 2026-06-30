package dz4;

/* loaded from: classes12.dex */
public final class i2 extends dz4.d2 {
    @Override // dz4.z1
    public void b(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        f(context);
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return context.f326789c.f326823a == 5;
    }

    @Override // dz4.d2
    public dc5.a d(java.lang.String msgXml, dz4.a2 forwardData, dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgXml, "msgXml");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forwardData, "forwardData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        dc5.a d17 = super.d(msgXml, forwardData, context);
        int i17 = d17.f125235d;
        dz4.i iVar = context.f326789c;
        dz4.f fVar = iVar instanceof dz4.f ? (dz4.f) iVar : null;
        if (fVar != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                d17.set(i17 + 0, java.lang.Long.valueOf(java.lang.Long.parseLong(fVar.f326765m)));
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            d17.set(i17 + 1, fVar.f326766n);
        }
        return d17;
    }
}
