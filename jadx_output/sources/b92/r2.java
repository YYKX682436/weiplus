package b92;

/* loaded from: classes.dex */
public final class r2 extends e92.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.d9e).view(com.tencent.mm.R.id.d9e).desc(com.tencent.mm.R.string.ckj);
        root(com.tencent.mm.R.id.l0r).view(com.tencent.mm.R.id.l0r).desc(com.tencent.mm.R.string.csw);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.fwd);
        root.view(com.tencent.mm.R.id.fwc).desc(com.tencent.mm.R.string.ewa).checkOn(b92.o2.f18499d);
        root.view(com.tencent.mm.R.id.fwa).desc(com.tencent.mm.R.string.ewa).disable(b92.p2.f18501d).checkOn(b92.q2.f18506d);
    }
}
