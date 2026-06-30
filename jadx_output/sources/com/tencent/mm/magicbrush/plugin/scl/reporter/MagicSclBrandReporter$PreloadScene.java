package com.tencent.mm.magicbrush.plugin.scl.reporter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"com/tencent/mm/magicbrush/plugin/scl/reporter/MagicSclBrandReporter$PreloadScene", "", "Lcom/tencent/mm/magicbrush/plugin/scl/reporter/MagicSclBrandReporter$PreloadScene;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "NoPreload", "OutBox", "InBox", "Expose", "mb-plugin-scl_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MagicSclBrandReporter$PreloadScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[] $VALUES;
    private final int value;
    public static final com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene NoPreload = new com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene("NoPreload", 0, 0);
    public static final com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene OutBox = new com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene("OutBox", 1, 1);
    public static final com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene InBox = new com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene("InBox", 2, 2);
    public static final com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene Expose = new com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene("Expose", 3, 3);

    private static final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[] $values() {
        return new com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[]{NoPreload, OutBox, InBox, Expose};
    }

    static {
        com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private MagicSclBrandReporter$PreloadScene(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene valueOf(java.lang.String str) {
        return (com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene) java.lang.Enum.valueOf(com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.class, str);
    }

    public static com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[] values() {
        return (com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
