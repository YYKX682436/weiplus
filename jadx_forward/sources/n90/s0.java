package n90;

/* loaded from: classes4.dex */
public final class s0 implements tg3.b1 {
    @Override // tg3.b1
    public java.lang.String Bb(java.util.Map map, java.lang.String str, android.os.Bundle bundle) {
        java.lang.String str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append(".content");
        return (map == null || (str2 = (java.lang.String) map.get(sb6.toString())) == null) ? "" : str2;
    }
}
