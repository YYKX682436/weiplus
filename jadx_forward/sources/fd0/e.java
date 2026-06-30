package fd0;

@j95.b
/* loaded from: classes11.dex */
public class e extends i95.w implements gd0.e {
    public n65.f wi(java.lang.String str) {
        m65.b bVar = m65.b.f405940b;
        int indexOf = str.indexOf("@");
        if (indexOf < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoomServiceFactory", "get NotNullChatRoom %s", str);
            return new n65.g();
        }
        java.lang.String substring = str.substring(indexOf);
        java.util.HashMap hashMap = m65.b.f405940b.f405941a;
        n65.f fVar = hashMap.containsKey(substring) ? (n65.f) hashMap.get(substring) : null;
        if (fVar == null) {
            java.util.Iterator it = ((fs.e) ((fs.c) fs.g.f(n65.e.class)).all()).iterator();
            while (it.hasNext()) {
                fs.q qVar = (fs.q) it.next();
                if (qVar.mo210xb7045565(substring)) {
                    fVar = ((n65.e) qVar.get()).get();
                }
            }
        }
        n65.f fVar2 = fVar;
        return fVar2 == null ? new n65.g() : fVar2;
    }
}
