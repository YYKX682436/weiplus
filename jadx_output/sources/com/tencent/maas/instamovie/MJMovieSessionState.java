package com.tencent.maas.instamovie;

/* loaded from: classes5.dex */
public enum MJMovieSessionState {
    Error(-1),
    Initial(0),
    InitialCreating(1),
    Ready(2),
    Recreating(3),
    Exporting(4),
    Playing(5),
    Updating(6),
    Teardowning(7),
    Switching(8);

    private final int value;

    MJMovieSessionState(int i17) {
        this.value = i17;
    }

    public static com.tencent.maas.instamovie.MJMovieSessionState fromInt(int i17) {
        for (com.tencent.maas.instamovie.MJMovieSessionState mJMovieSessionState : values()) {
            if (mJMovieSessionState.getValue() == i17) {
                return mJMovieSessionState;
            }
        }
        return Error;
    }

    public int getValue() {
        return this.value;
    }
}
