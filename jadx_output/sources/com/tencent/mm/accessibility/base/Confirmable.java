package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/tencent/mm/accessibility/base/Confirmable;", "", "Ljz5/f0;", "confirm$plugin_autoaccessibility_release", "()V", "confirm", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "originConfig", "<init>", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)V", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class Confirmable {
    public static final int $stable = 0;

    public Confirmable(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig originConfig) {
        kotlin.jvm.internal.o.g(originConfig, "originConfig");
        originConfig.getConfirmableList$plugin_autoaccessibility_release().add(this);
    }

    public abstract void confirm$plugin_autoaccessibility_release();
}
