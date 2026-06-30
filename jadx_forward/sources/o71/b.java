package o71;

@j95.b
/* loaded from: classes12.dex */
public final class b extends i95.w implements ct.o2 {
    public void wi(yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        o71.l.Bi().g();
        s71.a aVar = o71.l.Bi().f441872a;
        java.util.LinkedList linkedList = aVar != null ? aVar.f485502d : null;
        if (!(linkedList == null || linkedList.isEmpty())) {
            callback.mo146xb9724478(linkedList);
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839 c5868xe54ea839 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5868xe54ea839();
        c5868xe54ea839.f136177h.f88786a = Integer.MAX_VALUE;
        c5868xe54ea839.f273897d = new o71.a(c5868xe54ea839, callback);
        c5868xe54ea839.b(android.os.Looper.getMainLooper());
    }
}
