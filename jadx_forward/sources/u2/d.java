package u2;

/* loaded from: classes15.dex */
public class d extends u2.b {
    public void e(u2.j jVar) {
        float f17;
        int i17 = jVar.f505381c;
        if (i17 != 1) {
            if (i17 == 2) {
                f17 = 1000.0f;
            } else if (i17 == 3) {
                f17 = 1000000.0f;
            } else if (i17 == 4) {
                f17 = 1.0E9f;
            } else if (i17 == 5) {
                f17 = 1.0E12f;
            }
            this.f505352c.f(jVar, f17);
            jVar.f505387i--;
        }
        f17 = 1.0f;
        this.f505352c.f(jVar, f17);
        jVar.f505387i--;
    }
}
