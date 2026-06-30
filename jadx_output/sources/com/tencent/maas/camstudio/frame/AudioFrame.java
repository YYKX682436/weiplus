package com.tencent.maas.camstudio.frame;

/* loaded from: classes5.dex */
public interface AudioFrame extends com.tencent.maas.camstudio.frame.Frame {
    java.nio.ByteBuffer getAudioData();

    int getChannelCount();

    int getSampleCountPerChannel();

    int getSampleFormat();

    int getSampleRate();
}
