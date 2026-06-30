package z2;

/* loaded from: classes13.dex */
public abstract class p1 {
    public static z2.r1 a(android.app.Person person) {
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b;
        z2.q1 q1Var = new z2.q1();
        q1Var.f551040a = person.getName();
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b2 = null;
        if (person.getIcon() != null) {
            android.graphics.drawable.Icon icon = person.getIcon();
            android.graphics.PorterDuff.Mode mode = p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.f92569k;
            icon.getClass();
            int c17 = f3.e.c(icon);
            if (c17 != 2) {
                if (c17 == 4) {
                    android.net.Uri d17 = f3.e.d(icon);
                    d17.getClass();
                    java.lang.String uri = d17.toString();
                    uri.getClass();
                    c1090x3d9c397b = new p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b(4);
                    c1090x3d9c397b.f92571b = uri;
                } else if (c17 != 6) {
                    c1090x3d9c397b2 = new p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b(-1);
                    c1090x3d9c397b2.f92571b = icon;
                } else {
                    android.net.Uri d18 = f3.e.d(icon);
                    d18.getClass();
                    java.lang.String uri2 = d18.toString();
                    uri2.getClass();
                    c1090x3d9c397b = new p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b(6);
                    c1090x3d9c397b.f92571b = uri2;
                }
                c1090x3d9c397b2 = c1090x3d9c397b;
            } else {
                c1090x3d9c397b2 = p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b.e(null, f3.e.b(icon), f3.e.a(icon));
            }
        }
        q1Var.f551041b = c1090x3d9c397b2;
        q1Var.f551042c = person.getUri();
        q1Var.f551043d = person.getKey();
        q1Var.f551044e = person.isBot();
        q1Var.f551045f = person.isImportant();
        return new z2.r1(q1Var);
    }

    public static android.app.Person b(z2.r1 r1Var) {
        android.app.Person.Builder name = new android.app.Person.Builder().setName(r1Var.f551046a);
        android.graphics.drawable.Icon icon = null;
        p012xc85e97e9.p075x2eaf9f.p077x600aa8b.p078xcebc809e.C1090x3d9c397b c1090x3d9c397b = r1Var.f551047b;
        if (c1090x3d9c397b != null) {
            c1090x3d9c397b.getClass();
            icon = f3.e.f(c1090x3d9c397b, null);
        }
        return name.setIcon(icon).setUri(r1Var.f551048c).setKey(r1Var.f551049d).setBot(r1Var.f551050e).setImportant(r1Var.f551051f).build();
    }
}
