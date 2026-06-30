package t41;

/* loaded from: classes11.dex */
public abstract class f {
    public static java.util.LinkedList a(java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (list == null) {
            return linkedList;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.zz4 zz4Var = (r45.zz4) it.next();
            r45.wy wyVar = new r45.wy();
            wyVar.f471098d = zz4Var.f474017d;
            wyVar.f471099e = zz4Var.f474018e;
            wyVar.f471100f = zz4Var.f474019f;
            wyVar.f471101g = zz4Var.f474020g;
            wyVar.f471102h = zz4Var.f474021h;
            wyVar.f471103i = zz4Var.f474022i;
            wyVar.f471104m = zz4Var.f474025o;
            linkedList.add(wyVar);
        }
        return linkedList;
    }
}
