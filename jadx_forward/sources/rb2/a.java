package rb2;

/* loaded from: classes10.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final jz5.l a(float f17, float f18) {
        java.lang.Object obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561197c2);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr);
        if (f17 <= 0.0f || f18 <= 0.0f) {
            rb2.a aVar = rb2.b.f475103g;
            return new jz5.l(valueOf2, valueOf);
        }
        float f19 = f17 / f18;
        java.lang.Object[] array = rb2.b.f475105i.toArray(new rb2.b[0]);
        if (array.length == 0) {
            obj = null;
        } else {
            java.lang.Object obj2 = array[0];
            int length = array.length - 1;
            if (length != 0) {
                float abs = java.lang.Math.abs(f19 - ((rb2.b) obj2).f475106d);
                kz5.x0 it = new e06.k(1, length).iterator();
                while (((e06.j) it).f327747f) {
                    java.lang.Object obj3 = array[it.b()];
                    float abs2 = java.lang.Math.abs(f19 - ((rb2.b) obj3).f475106d);
                    if (java.lang.Float.compare(abs, abs2) > 0) {
                        obj2 = obj3;
                        abs = abs2;
                    }
                }
            }
            obj = obj2;
        }
        rb2.b bVar = (rb2.b) obj;
        if (bVar != null) {
            return new jz5.l(java.lang.Integer.valueOf(bVar.f475107e), java.lang.Integer.valueOf(bVar.f475108f));
        }
        rb2.a aVar2 = rb2.b.f475103g;
        return new jz5.l(valueOf2, valueOf);
    }
}
