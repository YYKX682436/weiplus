package ca;

/* loaded from: classes13.dex */
public class f implements android.animation.TypeEvaluator {

    /* renamed from: b, reason: collision with root package name */
    public static final android.animation.TypeEvaluator f121291b = new ca.f();

    /* renamed from: a, reason: collision with root package name */
    public final ca.i f121292a = new ca.i((ca.e) null);

    @Override // android.animation.TypeEvaluator
    public java.lang.Object evaluate(float f17, java.lang.Object obj, java.lang.Object obj2) {
        ca.i iVar = (ca.i) obj;
        ca.i iVar2 = (ca.i) obj2;
        float f18 = 1.0f - f17;
        float f19 = (iVar.f121295a * f18) + (iVar2.f121295a * f17);
        float f27 = (iVar.f121296b * f18) + (iVar2.f121296b * f17);
        float f28 = (f18 * iVar.f121297c) + (f17 * iVar2.f121297c);
        ca.i iVar3 = this.f121292a;
        iVar3.f121295a = f19;
        iVar3.f121296b = f27;
        iVar3.f121297c = f28;
        return iVar3;
    }
}
