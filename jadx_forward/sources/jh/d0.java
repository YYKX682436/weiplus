package jh;

/* loaded from: classes13.dex */
public enum d0 {
    Fp(0),
    Quicken(1),
    Dwarf(2),
    FpUntilQuickenWarmedUp(3),
    DwarfUntilQuickenWarmedUp(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f381228d;

    d0(int i17) {
        this.f381228d = i17;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        int ordinal = ordinal();
        return ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "Unreachable." : "Use dwarf-based backtrace before quicken has warmed up." : "Use fp-based backtrace before quicken has warmed up." : "Dwarf-based." : "WeChat QuickenUnwindTable-based." : "FramePointer-based.";
    }
}
