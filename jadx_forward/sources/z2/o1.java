package z2;

/* loaded from: classes13.dex */
public abstract class o1 {
    public static z2.r1 a(android.os.PersistableBundle persistableBundle) {
        z2.q1 q1Var = new z2.q1();
        q1Var.f551040a = persistableBundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        q1Var.f551042c = persistableBundle.getString("uri");
        q1Var.f551043d = persistableBundle.getString("key");
        q1Var.f551044e = persistableBundle.getBoolean("isBot");
        q1Var.f551045f = persistableBundle.getBoolean("isImportant");
        return new z2.r1(q1Var);
    }

    public static android.os.PersistableBundle b(z2.r1 r1Var) {
        android.os.PersistableBundle persistableBundle = new android.os.PersistableBundle();
        java.lang.CharSequence charSequence = r1Var.f551046a;
        persistableBundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", r1Var.f551048c);
        persistableBundle.putString("key", r1Var.f551049d);
        persistableBundle.putBoolean("isBot", r1Var.f551050e);
        persistableBundle.putBoolean("isImportant", r1Var.f551051f);
        return persistableBundle;
    }
}
